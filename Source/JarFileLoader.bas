Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=3.2
@EndOfDesignText@
'Class module
Sub Class_Globals
	Private fromAssets As Boolean
End Sub

Public Sub Initialize (FromAssetsFile As Boolean)
	fromAssets = FromAssetsFile
End Sub

Public Sub LoadFileFileFromJar(FileName As String) As InputStream
	If fromAssets Then Return File.OpenInput(File.DirAssets, FileName)
	Dim r As Reflector
	r.Target = Me
	r.Target = r.RunMethod("getClass")
	Dim In As InputStream = r.RunMethod2("getResourceAsStream", "/" & FileName, "java.lang.String")
	If In.IsInitialized = False Then
		LogColor("Cannot find file: " & FileName, Colors.Red)
	End If
	Return In
End Sub

Public Sub LoadBitmapFromJar(FileName As String) As Bitmap
	Dim bmp As Bitmap
	If fromAssets == True And File.Exists(File.DirAssets,FileName) Then
		bmp = LoadBitmap(File.DirAssets,FileName)
	Else
		Dim In As InputStream = LoadFileFileFromJar(FileName)
		bmp.Initialize2(In)
		In.Close
	End If
	Return bmp
End Sub

Public Sub LoadBitmapSampleFromJar(FileName As String, Width As Int, Height As Int) As Bitmap
	If File.Exists(File.DirInternalCache, FileName) = False Then
		Dim out As OutputStream = File.OpenOutput(File.DirInternalCache, FileName, False)
		File.Copy2(LoadFileFileFromJar(FileName), out)
		out.Close
	End If
	Return LoadBitmapSample(File.DirInternalCache, FileName, Width, Height)
End Sub

Public Sub AssetFromJar(FileName As String) As Boolean
	Try
		If File.Exists(File.DirInternalCache, FileName) = False Then
			Dim out As OutputStream = File.OpenOutput(File.DirInternalCache, FileName, False)
			File.Copy2(LoadFileFileFromJar(FileName), out)
			out.Close
			Return True
		Else
			Return True    ' File OK anyway
		End If
	Catch
		Log("Failed to copy file to Assets: " & FileName)
		Return False
	End Try
End Sub

Public Sub LoadNinePatchDrawable(FileName As String) As Object
	Dim b As Bitmap = LoadBitmapFromJar(FileName)
	Dim jo As JavaObject = b
	Dim chunk() As Byte = jo.RunMethod("getNinePatchChunk", Null)
	Dim nineDrawable As JavaObject
	nineDrawable.InitializeNewInstance("android.graphics.drawable.NinePatchDrawable", Array(Null, b, chunk, Null, ""))
	Return nineDrawable
End Sub