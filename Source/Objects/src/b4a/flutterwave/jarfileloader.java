package b4a.flutterwave;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class jarfileloader extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.flutterwave.jarfileloader");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.flutterwave.jarfileloader.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public boolean _fromassets = false;
public b4a.flutterwave.httputils2service _httputils2service = null;
public boolean  _assetfromjar(String _filename) throws Exception{
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
 //BA.debugLineNum = 43;BA.debugLine="Public Sub AssetFromJar(FileName As String) As Boo";
 //BA.debugLineNum = 44;BA.debugLine="Try";
try { //BA.debugLineNum = 45;BA.debugLine="If File.Exists(File.DirInternalCache, FileName)";
if (__c.File.Exists(__c.File.getDirInternalCache(),_filename)==__c.False) { 
 //BA.debugLineNum = 46;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(__c.File.getDirInternalCache(),_filename,__c.False);
 //BA.debugLineNum = 47;BA.debugLine="File.Copy2(LoadFileFileFromJar(FileName), out)";
__c.File.Copy2((java.io.InputStream)(_loadfilefilefromjar(_filename).getObject()),(java.io.OutputStream)(_out.getObject()));
 //BA.debugLineNum = 48;BA.debugLine="out.Close";
_out.Close();
 //BA.debugLineNum = 49;BA.debugLine="Return True";
if (true) return __c.True;
 }else {
 //BA.debugLineNum = 51;BA.debugLine="Return True    ' File OK anyway";
if (true) return __c.True;
 };
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 54;BA.debugLine="Log(\"Failed to copy file to Assets: \" & FileName";
__c.LogImpl("5917515","Failed to copy file to Assets: "+_filename,0);
 //BA.debugLineNum = 55;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fromAssets As Boolean";
_fromassets = false;
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,boolean _fromassetsfile) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize (FromAssetsFile As Boolean)";
 //BA.debugLineNum = 7;BA.debugLine="fromAssets = FromAssetsFile";
_fromassets = _fromassetsfile;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _loadbitmapfromjar(String _filename) throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
 //BA.debugLineNum = 22;BA.debugLine="Public Sub LoadBitmapFromJar(FileName As String) A";
 //BA.debugLineNum = 23;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 24;BA.debugLine="If fromAssets == True And File.Exists(File.DirAss";
if (_fromassets==__c.True && __c.File.Exists(__c.File.getDirAssets(),_filename)) { 
 //BA.debugLineNum = 25;BA.debugLine="bmp = LoadBitmap(File.DirAssets,FileName)";
_bmp = __c.LoadBitmap(__c.File.getDirAssets(),_filename);
 }else {
 //BA.debugLineNum = 27;BA.debugLine="Dim In As InputStream = LoadFileFileFromJar(File";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = _loadfilefilefromjar(_filename);
 //BA.debugLineNum = 28;BA.debugLine="bmp.Initialize2(In)";
_bmp.Initialize2((java.io.InputStream)(_in.getObject()));
 //BA.debugLineNum = 29;BA.debugLine="In.Close";
_in.Close();
 };
 //BA.debugLineNum = 31;BA.debugLine="Return bmp";
if (true) return _bmp;
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _loadbitmapsamplefromjar(String _filename,int _width,int _height) throws Exception{
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
 //BA.debugLineNum = 34;BA.debugLine="Public Sub LoadBitmapSampleFromJar(FileName As Str";
 //BA.debugLineNum = 35;BA.debugLine="If File.Exists(File.DirInternalCache, FileName) =";
if (__c.File.Exists(__c.File.getDirInternalCache(),_filename)==__c.False) { 
 //BA.debugLineNum = 36;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.D";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(__c.File.getDirInternalCache(),_filename,__c.False);
 //BA.debugLineNum = 37;BA.debugLine="File.Copy2(LoadFileFileFromJar(FileName), out)";
__c.File.Copy2((java.io.InputStream)(_loadfilefilefromjar(_filename).getObject()),(java.io.OutputStream)(_out.getObject()));
 //BA.debugLineNum = 38;BA.debugLine="out.Close";
_out.Close();
 };
 //BA.debugLineNum = 40;BA.debugLine="Return LoadBitmapSample(File.DirInternalCache, Fi";
if (true) return __c.LoadBitmapSample(__c.File.getDirInternalCache(),_filename,_width,_height);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper  _loadfilefilefromjar(String _filename) throws Exception{
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
 //BA.debugLineNum = 10;BA.debugLine="Public Sub LoadFileFileFromJar(FileName As String)";
 //BA.debugLineNum = 11;BA.debugLine="If fromAssets Then Return File.OpenInput(File.Dir";
if (_fromassets) { 
if (true) return __c.File.OpenInput(__c.File.getDirAssets(),_filename);};
 //BA.debugLineNum = 12;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 13;BA.debugLine="r.Target = Me";
_r.Target = this;
 //BA.debugLineNum = 14;BA.debugLine="r.Target = r.RunMethod(\"getClass\")";
_r.Target = _r.RunMethod("getClass");
 //BA.debugLineNum = 15;BA.debugLine="Dim In As InputStream = r.RunMethod2(\"getResource";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = (anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper(), (java.io.InputStream)(_r.RunMethod2("getResourceAsStream","/"+_filename,"java.lang.String")));
 //BA.debugLineNum = 16;BA.debugLine="If In.IsInitialized = False Then";
if (_in.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 17;BA.debugLine="LogColor(\"Cannot find file: \" & FileName, Colors";
__c.LogImpl("5720903","Cannot find file: "+_filename,__c.Colors.Red);
 };
 //BA.debugLineNum = 19;BA.debugLine="Return In";
if (true) return _in;
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public Object  _loadninepatchdrawable(String _filename) throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
byte[] _chunk = null;
anywheresoftware.b4j.object.JavaObject _ninedrawable = null;
 //BA.debugLineNum = 59;BA.debugLine="Public Sub LoadNinePatchDrawable(FileName As Strin";
 //BA.debugLineNum = 60;BA.debugLine="Dim b As Bitmap = LoadBitmapFromJar(FileName)";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_b = _loadbitmapfromjar(_filename);
 //BA.debugLineNum = 61;BA.debugLine="Dim jo As JavaObject = b";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_b.getObject()));
 //BA.debugLineNum = 62;BA.debugLine="Dim chunk() As Byte = jo.RunMethod(\"getNinePatchC";
_chunk = (byte[])(_jo.RunMethod("getNinePatchChunk",(Object[])(__c.Null)));
 //BA.debugLineNum = 63;BA.debugLine="Dim nineDrawable As JavaObject";
_ninedrawable = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 64;BA.debugLine="nineDrawable.InitializeNewInstance(\"android.graph";
_ninedrawable.InitializeNewInstance("android.graphics.drawable.NinePatchDrawable",new Object[]{__c.Null,(Object)(_b.getObject()),(Object)(_chunk),__c.Null,(Object)("")});
 //BA.debugLineNum = 65;BA.debugLine="Return nineDrawable";
if (true) return (Object)(_ninedrawable.getObject());
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
