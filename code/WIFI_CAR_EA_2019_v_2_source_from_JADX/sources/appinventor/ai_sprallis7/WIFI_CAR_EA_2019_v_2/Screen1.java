package appinventor.ai_sprallis7.WIFI_CAR_EA_2019_v_2;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.ActivityStarter;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Camera;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.TableArrangement;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.Web;
import com.google.appinventor.components.runtime.WebViewer;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.Procedure;
import gnu.mapping.PropertySet;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.DFloNum;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Screen1").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final IntNum Lit10;
    static final DFloNum Lit100 = DFloNum.make((double) 16);
    static final IntNum Lit101 = IntNum.make(-1007);
    static final IntNum Lit102;
    static final IntNum Lit103 = IntNum.make(-1010);
    static final FString Lit104 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit105 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1556572703615_0.2471628794878057-0/youngandroidproject/../src/appinventor/ai_sprallis7/WIFI_CAR_EA_2019_v_2/Screen1.yail", 831703), "/tmp/1556572703615_0.2471628794878057-0/youngandroidproject/../src/appinventor/ai_sprallis7/WIFI_CAR_EA_2019_v_2/Screen1.yail", 831697);
    static final PairWithPosition Lit106 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1556572703615_0.2471628794878057-0/youngandroidproject/../src/appinventor/ai_sprallis7/WIFI_CAR_EA_2019_v_2/Screen1.yail", 831727), "/tmp/1556572703615_0.2471628794878057-0/youngandroidproject/../src/appinventor/ai_sprallis7/WIFI_CAR_EA_2019_v_2/Screen1.yail", 831721);
    static final SimpleSymbol Lit107 = ((SimpleSymbol) new SimpleSymbol("forward$Click").readResolve());
    static final FString Lit108 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit109 = ((SimpleSymbol) new SimpleSymbol("right").readResolve());
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("CloseScreenAnimation").readResolve());
    static final IntNum Lit110 = IntNum.make(16777215);
    static final IntNum Lit111 = IntNum.make(2);
    static final DFloNum Lit112 = DFloNum.make((double) 16);
    static final IntNum Lit113 = IntNum.make(-1015);
    static final IntNum Lit114;
    static final IntNum Lit115 = IntNum.make(-1015);
    static final FString Lit116 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit117 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1556572703615_0.2471628794878057-0/youngandroidproject/../src/appinventor/ai_sprallis7/WIFI_CAR_EA_2019_v_2/Screen1.yail", 934101), "/tmp/1556572703615_0.2471628794878057-0/youngandroidproject/../src/appinventor/ai_sprallis7/WIFI_CAR_EA_2019_v_2/Screen1.yail", 934095);
    static final PairWithPosition Lit118 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1556572703615_0.2471628794878057-0/youngandroidproject/../src/appinventor/ai_sprallis7/WIFI_CAR_EA_2019_v_2/Screen1.yail", 934125), "/tmp/1556572703615_0.2471628794878057-0/youngandroidproject/../src/appinventor/ai_sprallis7/WIFI_CAR_EA_2019_v_2/Screen1.yail", 934119);
    static final SimpleSymbol Lit119 = ((SimpleSymbol) new SimpleSymbol("right$Click").readResolve());
    static final SimpleSymbol Lit12 = ((SimpleSymbol) new SimpleSymbol("Icon").readResolve());
    static final FString Lit120 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit121 = ((SimpleSymbol) new SimpleSymbol("backward").readResolve());
    static final IntNum Lit122 = IntNum.make(16777215);
    static final IntNum Lit123 = IntNum.make(-1007);
    static final IntNum Lit124;
    static final IntNum Lit125 = IntNum.make(-1010);
    static final FString Lit126 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit127 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1556572703615_0.2471628794878057-0/youngandroidproject/../src/appinventor/ai_sprallis7/WIFI_CAR_EA_2019_v_2/Screen1.yail", 1036504), "/tmp/1556572703615_0.2471628794878057-0/youngandroidproject/../src/appinventor/ai_sprallis7/WIFI_CAR_EA_2019_v_2/Screen1.yail", 1036498);
    static final PairWithPosition Lit128 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1556572703615_0.2471628794878057-0/youngandroidproject/../src/appinventor/ai_sprallis7/WIFI_CAR_EA_2019_v_2/Screen1.yail", 1036528), "/tmp/1556572703615_0.2471628794878057-0/youngandroidproject/../src/appinventor/ai_sprallis7/WIFI_CAR_EA_2019_v_2/Screen1.yail", 1036522);
    static final SimpleSymbol Lit129 = ((SimpleSymbol) new SimpleSymbol("backward$Click").readResolve());
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("OpenScreenAnimation").readResolve());
    static final FString Lit130 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit131 = ((SimpleSymbol) new SimpleSymbol("camera").readResolve());
    static final IntNum Lit132 = IntNum.make(-1007);
    static final FString Lit133 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit134 = ((SimpleSymbol) new SimpleSymbol("Web2").readResolve());
    static final SimpleSymbol Lit135 = ((SimpleSymbol) new SimpleSymbol("TextBox1").readResolve());
    static final SimpleSymbol Lit136 = ((SimpleSymbol) new SimpleSymbol("WebViewer1").readResolve());
    static final SimpleSymbol Lit137 = ((SimpleSymbol) new SimpleSymbol("GoToUrl").readResolve());
    static final PairWithPosition Lit138;
    static final SimpleSymbol Lit139 = ((SimpleSymbol) new SimpleSymbol("camera$Click").readResolve());
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("ScreenOrientation").readResolve());
    static final FString Lit140 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit141 = ((SimpleSymbol) new SimpleSymbol("Hint").readResolve());
    static final IntNum Lit142 = IntNum.make(-1020);
    static final FString Lit143 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit144 = new FString("com.google.appinventor.components.runtime.WebViewer");
    static final FString Lit145 = new FString("com.google.appinventor.components.runtime.WebViewer");
    static final FString Lit146 = new FString("com.google.appinventor.components.runtime.Web");
    static final FString Lit147 = new FString("com.google.appinventor.components.runtime.Web");
    static final FString Lit148 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
    static final SimpleSymbol Lit149 = ((SimpleSymbol) new SimpleSymbol("ActivityStarter1").readResolve());
    static final SimpleSymbol Lit15 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final FString Lit150 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
    static final FString Lit151 = new FString("com.google.appinventor.components.runtime.Camera");
    static final SimpleSymbol Lit152 = ((SimpleSymbol) new SimpleSymbol("Camera1").readResolve());
    static final FString Lit153 = new FString("com.google.appinventor.components.runtime.Camera");
    static final FString Lit154 = new FString("com.google.appinventor.components.runtime.Web");
    static final FString Lit155 = new FString("com.google.appinventor.components.runtime.Web");
    static final SimpleSymbol Lit156 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit157 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit158 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit159 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve());
    static final SimpleSymbol Lit160 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit161 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit162 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit163 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit164 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit165 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit166 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit167 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit17 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final FString Lit18 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final IntNum Lit20 = IntNum.make(16777215);
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit22 = IntNum.make(-1010);
    static final SimpleSymbol Lit23 = ((SimpleSymbol) new SimpleSymbol("Image").readResolve());
    static final SimpleSymbol Lit24 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final IntNum Lit25 = IntNum.make(-2);
    static final FString Lit26 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit27 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit28 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement4").readResolve());
    static final IntNum Lit29 = IntNum.make(16777215);
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AboutScreen").readResolve());
    static final IntNum Lit30 = IntNum.make(-1007);
    static final FString Lit31 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit32 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("Label6").readResolve());
    static final SimpleSymbol Lit34 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit35 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final IntNum Lit36 = IntNum.make(14);
    static final SimpleSymbol Lit37 = ((SimpleSymbol) new SimpleSymbol("FontTypeface").readResolve());
    static final IntNum Lit38 = IntNum.make(-1004);
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit4;
    static final SimpleSymbol Lit40 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final IntNum Lit41 = IntNum.make(1);
    static final FString Lit42 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit43 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit44 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement6").readResolve());
    static final IntNum Lit45 = IntNum.make(16777215);
    static final IntNum Lit46 = IntNum.make(-1001);
    static final FString Lit47 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit48 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit49 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement5").readResolve());
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final IntNum Lit50 = IntNum.make(16777215);
    static final IntNum Lit51 = IntNum.make(-1009);
    static final FString Lit52 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit53 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("IP_address").readResolve());
    static final IntNum Lit55;
    static final IntNum Lit56 = IntNum.make(18);
    static final IntNum Lit57 = IntNum.make(-1007);
    static final SimpleSymbol Lit58 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit59;
    static final IntNum Lit6 = IntNum.make(3);
    static final FString Lit60 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit61 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final SimpleSymbol Lit62 = ((SimpleSymbol) new SimpleSymbol("TableArrangement1").readResolve());
    static final SimpleSymbol Lit63 = ((SimpleSymbol) new SimpleSymbol("Columns").readResolve());
    static final IntNum Lit64 = IntNum.make(-1036);
    static final SimpleSymbol Lit65 = ((SimpleSymbol) new SimpleSymbol("Rows").readResolve());
    static final IntNum Lit66 = IntNum.make(-1090);
    static final FString Lit67 = new FString("com.google.appinventor.components.runtime.TableArrangement");
    static final FString Lit68 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit69 = ((SimpleSymbol) new SimpleSymbol("left").readResolve());
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final IntNum Lit70 = IntNum.make(16777215);
    static final SimpleSymbol Lit71 = ((SimpleSymbol) new SimpleSymbol("Column").readResolve());
    static final IntNum Lit72 = IntNum.make(0);
    static final DFloNum Lit73 = DFloNum.make((double) 16);
    static final IntNum Lit74 = IntNum.make(-1015);
    static final SimpleSymbol Lit75 = ((SimpleSymbol) new SimpleSymbol("Row").readResolve());
    static final IntNum Lit76;
    static final IntNum Lit77 = IntNum.make(-1020);
    static final FString Lit78 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit79 = ((SimpleSymbol) new SimpleSymbol("Web1").readResolve());
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit80 = ((SimpleSymbol) new SimpleSymbol("Url").readResolve());
    static final PairWithPosition Lit81 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1556572703615_0.2471628794878057-0/youngandroidproject/../src/appinventor/ai_sprallis7/WIFI_CAR_EA_2019_v_2/Screen1.yail", 618708), "/tmp/1556572703615_0.2471628794878057-0/youngandroidproject/../src/appinventor/ai_sprallis7/WIFI_CAR_EA_2019_v_2/Screen1.yail", 618702);
    static final PairWithPosition Lit82 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1556572703615_0.2471628794878057-0/youngandroidproject/../src/appinventor/ai_sprallis7/WIFI_CAR_EA_2019_v_2/Screen1.yail", 618732), "/tmp/1556572703615_0.2471628794878057-0/youngandroidproject/../src/appinventor/ai_sprallis7/WIFI_CAR_EA_2019_v_2/Screen1.yail", 618726);
    static final SimpleSymbol Lit83 = ((SimpleSymbol) new SimpleSymbol("Get").readResolve());
    static final SimpleSymbol Lit84 = ((SimpleSymbol) new SimpleSymbol("left$Click").readResolve());
    static final SimpleSymbol Lit85 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit86 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("stop").readResolve());
    static final IntNum Lit88 = IntNum.make(16777215);
    static final IntNum Lit89 = IntNum.make(16);
    static final SimpleSymbol Lit9 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final IntNum Lit90 = IntNum.make(-1020);
    static final IntNum Lit91;
    static final IntNum Lit92 = IntNum.make(-1025);
    static final FString Lit93 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit94 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1556572703615_0.2471628794878057-0/youngandroidproject/../src/appinventor/ai_sprallis7/WIFI_CAR_EA_2019_v_2/Screen1.yail", 721108), "/tmp/1556572703615_0.2471628794878057-0/youngandroidproject/../src/appinventor/ai_sprallis7/WIFI_CAR_EA_2019_v_2/Screen1.yail", 721102);
    static final PairWithPosition Lit95 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1556572703615_0.2471628794878057-0/youngandroidproject/../src/appinventor/ai_sprallis7/WIFI_CAR_EA_2019_v_2/Screen1.yail", 721132), "/tmp/1556572703615_0.2471628794878057-0/youngandroidproject/../src/appinventor/ai_sprallis7/WIFI_CAR_EA_2019_v_2/Screen1.yail", 721126);
    static final SimpleSymbol Lit96 = ((SimpleSymbol) new SimpleSymbol("stop$Click").readResolve());
    static final FString Lit97 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit98 = ((SimpleSymbol) new SimpleSymbol("forward").readResolve());
    static final IntNum Lit99 = IntNum.make(16777215);
    public static Screen1 Screen1;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public ActivityStarter ActivityStarter1;
    public Camera Camera1;
    public HorizontalArrangement HorizontalArrangement3;
    public HorizontalArrangement HorizontalArrangement4;
    public HorizontalArrangement HorizontalArrangement5;
    public HorizontalArrangement HorizontalArrangement6;
    public TextBox IP_address;
    public Label Label6;
    public TableArrangement TableArrangement1;
    public TextBox TextBox1;
    public Web Web1;
    public Web Web2;
    public WebViewer WebViewer1;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public Button backward;
    public final ModuleMethod backward$Click;
    public Button camera;
    public final ModuleMethod camera$Click;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public Button forward;
    public final ModuleMethod forward$Click;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public Button left;
    public final ModuleMethod left$Click;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod onCreate;
    public final ModuleMethod process$Mnexception;
    public Button right;
    public final ModuleMethod right$Click;
    public final ModuleMethod send$Mnerror;
    public Button stop;
    public final ModuleMethod stop$Click;

    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main = this;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 2:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 4:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 6:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 11:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 12:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 13:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 3:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 4:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 7:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 8:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 10:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 15:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 14:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 1:
                    try {
                        this.$main.onCreate((Bundle) obj);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "onCreate", 1, obj);
                    }
                case 2:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 4:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 6:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e22) {
                        throw new WrongType(e22, "is-bound-in-form-environment", 1, obj);
                    }
                case 11:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 12:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 13:
                    this.$main.processException(obj);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            switch (moduleMethod.selector) {
                case 9:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 14:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e22) {
                            throw new WrongType(e22, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e222) {
                        throw new WrongType(e222, "dispatchEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 3:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 4:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 7:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e22) {
                        throw new WrongType(e22, "add-to-global-var-environment", 1, obj);
                    }
                case 8:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 10:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 15:
                    return this.$main.lookupHandler(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 16:
                    return Screen1.lambda2();
                case 17:
                    this.$main.$define();
                    return Values.empty;
                case 18:
                    return Screen1.lambda3();
                case 19:
                    return Screen1.lambda4();
                case 20:
                    return Screen1.lambda5();
                case 21:
                    return Screen1.lambda6();
                case 22:
                    return Screen1.lambda7();
                case 23:
                    return Screen1.lambda8();
                case 24:
                    return Screen1.lambda9();
                case 25:
                    return Screen1.lambda10();
                case 26:
                    return Screen1.lambda11();
                case 27:
                    return Screen1.lambda12();
                case 28:
                    return Screen1.lambda13();
                case 29:
                    return Screen1.lambda14();
                case 30:
                    return Screen1.lambda15();
                case 31:
                    return Screen1.lambda16();
                case 32:
                    return Screen1.lambda17();
                case 33:
                    return Screen1.lambda18();
                case 34:
                    return Screen1.lambda19();
                case 35:
                    return this.$main.left$Click();
                case 36:
                    return Screen1.lambda20();
                case 37:
                    return Screen1.lambda21();
                case 38:
                    return this.$main.stop$Click();
                case 39:
                    return Screen1.lambda22();
                case 40:
                    return Screen1.lambda23();
                case 41:
                    return this.$main.forward$Click();
                case 42:
                    return Screen1.lambda24();
                case 43:
                    return Screen1.lambda25();
                case 44:
                    return this.$main.right$Click();
                case 45:
                    return Screen1.lambda26();
                case 46:
                    return Screen1.lambda27();
                case 47:
                    return this.$main.backward$Click();
                case 48:
                    return Screen1.lambda28();
                case 49:
                    return Screen1.lambda29();
                case 50:
                    return this.$main.camera$Click();
                case 51:
                    return Screen1.lambda30();
                case 52:
                    return Screen1.lambda31();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 16:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 17:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 18:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 24:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 25:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 26:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 27:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 28:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 29:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 30:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 32:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 33:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 34:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 35:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 36:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 37:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 38:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 39:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 40:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 41:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 42:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 43:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 44:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 45:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 46:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 47:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 48:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 49:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 50:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 51:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 52:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit138 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1556572703615_0.2471628794878057-0/youngandroidproject/../src/appinventor/ai_sprallis7/WIFI_CAR_EA_2019_v_2/Screen1.yail", 1097899);
        int[] iArr = new int[2];
        iArr[0] = -1;
        Lit124 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = -1;
        Lit114 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = -1;
        Lit102 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = -1;
        Lit91 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = -1;
        Lit76 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = Component.COLOR_BLUE;
        Lit59 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = -1;
        Lit55 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = -65536;
        Lit10 = IntNum.make(iArr);
    }

    public Screen1() {
        ModuleInfo.register(this);
        ModuleBody frame = new frame();
        this.onCreate = new ModuleMethod(frame, 1, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame, 2, Lit156, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame, 3, Lit157, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame, 4, Lit158, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame, 6, Lit159, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame, 7, Lit160, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame, 8, Lit161, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame, 9, Lit162, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame, 10, Lit163, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame, 11, Lit164, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame, 12, Lit165, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame, 14, Lit166, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame, 15, Lit167, 8194);
        PropertySet moduleMethod = new ModuleMethod(frame, 16, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime916966379519640473.scm:581");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame, 17, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame, 18, null, 0);
        lambda$Fn3 = new ModuleMethod(frame, 19, null, 0);
        lambda$Fn4 = new ModuleMethod(frame, 20, null, 0);
        lambda$Fn5 = new ModuleMethod(frame, 21, null, 0);
        lambda$Fn6 = new ModuleMethod(frame, 22, null, 0);
        lambda$Fn7 = new ModuleMethod(frame, 23, null, 0);
        lambda$Fn8 = new ModuleMethod(frame, 24, null, 0);
        lambda$Fn9 = new ModuleMethod(frame, 25, null, 0);
        lambda$Fn10 = new ModuleMethod(frame, 26, null, 0);
        lambda$Fn11 = new ModuleMethod(frame, 27, null, 0);
        lambda$Fn12 = new ModuleMethod(frame, 28, null, 0);
        lambda$Fn13 = new ModuleMethod(frame, 29, null, 0);
        lambda$Fn14 = new ModuleMethod(frame, 30, null, 0);
        lambda$Fn15 = new ModuleMethod(frame, 31, null, 0);
        lambda$Fn16 = new ModuleMethod(frame, 32, null, 0);
        lambda$Fn17 = new ModuleMethod(frame, 33, null, 0);
        lambda$Fn18 = new ModuleMethod(frame, 34, null, 0);
        this.left$Click = new ModuleMethod(frame, 35, Lit84, 0);
        lambda$Fn19 = new ModuleMethod(frame, 36, null, 0);
        lambda$Fn20 = new ModuleMethod(frame, 37, null, 0);
        this.stop$Click = new ModuleMethod(frame, 38, Lit96, 0);
        lambda$Fn21 = new ModuleMethod(frame, 39, null, 0);
        lambda$Fn22 = new ModuleMethod(frame, 40, null, 0);
        this.forward$Click = new ModuleMethod(frame, 41, Lit107, 0);
        lambda$Fn23 = new ModuleMethod(frame, 42, null, 0);
        lambda$Fn24 = new ModuleMethod(frame, 43, null, 0);
        this.right$Click = new ModuleMethod(frame, 44, Lit119, 0);
        lambda$Fn25 = new ModuleMethod(frame, 45, null, 0);
        lambda$Fn26 = new ModuleMethod(frame, 46, null, 0);
        this.backward$Click = new ModuleMethod(frame, 47, Lit129, 0);
        lambda$Fn27 = new ModuleMethod(frame, 48, null, 0);
        lambda$Fn28 = new ModuleMethod(frame, 49, null, 0);
        this.camera$Click = new ModuleMethod(frame, 50, Lit139, 0);
        lambda$Fn29 = new ModuleMethod(frame, 51, null, 0);
        lambda$Fn30 = new ModuleMethod(frame, 52, null, 0);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        Throwable th;
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        try {
            String str;
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
            if (stringAppend == null) {
                str = null;
            } else {
                str = stringAppend.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(str);
            Screen1 = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            find = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find).run();
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "EA_WIFI_CAR", Lit4);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Lit6, Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "EA_WIFI_CAR", Lit4);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit9, Lit10, Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "fade", Lit4);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit12, "EA_LOGO.png", Lit4);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "fade", Lit4);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "portrait", Lit4);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "NodeMCU WiFi Robot Control", Lit4);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.FALSE, Lit17), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                this.HorizontalArrangement3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit18, Lit19, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit0, Lit26, Lit19, lambda$Fn4);
                }
                this.HorizontalArrangement4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit27, Lit28, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit0, Lit31, Lit28, lambda$Fn6);
                }
                this.Label6 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit28, Lit32, Lit33, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit28, Lit42, Lit33, lambda$Fn8);
                }
                this.HorizontalArrangement6 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit43, Lit44, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit0, Lit47, Lit44, lambda$Fn10);
                }
                this.HorizontalArrangement5 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit48, Lit49, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit0, Lit52, Lit49, lambda$Fn12);
                }
                this.IP_address = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit49, Lit53, Lit54, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit49, Lit60, Lit54, lambda$Fn14);
                }
                this.TableArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit61, Lit62, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit0, Lit67, Lit62, lambda$Fn16);
                }
                this.left = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit62, Lit68, Lit69, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit62, Lit78, Lit69, lambda$Fn18);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit84, this.left$Click);
                } else {
                    addToFormEnvironment(Lit84, this.left$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "left", "Click");
                } else {
                    addToEvents(Lit69, Lit85);
                }
                this.stop = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit62, Lit86, Lit87, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit62, Lit93, Lit87, lambda$Fn20);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit96, this.stop$Click);
                } else {
                    addToFormEnvironment(Lit96, this.stop$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "stop", "Click");
                } else {
                    addToEvents(Lit87, Lit85);
                }
                this.forward = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit62, Lit97, Lit98, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit62, Lit104, Lit98, lambda$Fn22);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit107, this.forward$Click);
                } else {
                    addToFormEnvironment(Lit107, this.forward$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "forward", "Click");
                } else {
                    addToEvents(Lit98, Lit85);
                }
                this.right = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit62, Lit108, Lit109, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit62, Lit116, Lit109, lambda$Fn24);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit119, this.right$Click);
                } else {
                    addToFormEnvironment(Lit119, this.right$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "right", "Click");
                } else {
                    addToEvents(Lit109, Lit85);
                }
                this.backward = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit62, Lit120, Lit121, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit62, Lit126, Lit121, lambda$Fn26);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit129, this.backward$Click);
                } else {
                    addToFormEnvironment(Lit129, this.backward$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "backward", "Click");
                } else {
                    addToEvents(Lit121, Lit85);
                }
                this.camera = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit62, Lit130, Lit131, lambda$Fn27), $result);
                } else {
                    addToComponents(Lit62, Lit133, Lit131, lambda$Fn28);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit139, this.camera$Click);
                } else {
                    addToFormEnvironment(Lit139, this.camera$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "camera", "Click");
                } else {
                    addToEvents(Lit131, Lit85);
                }
                this.TextBox1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit62, Lit140, Lit135, lambda$Fn29), $result);
                } else {
                    addToComponents(Lit62, Lit143, Lit135, lambda$Fn30);
                }
                this.WebViewer1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit144, Lit136, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit145, Lit136, Boolean.FALSE);
                }
                this.Web1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit146, Lit79, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit147, Lit79, Boolean.FALSE);
                }
                this.ActivityStarter1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit148, Lit149, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit150, Lit149, Boolean.FALSE);
                }
                this.Camera1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit151, Lit152, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit153, Lit152, Boolean.FALSE);
                }
                this.Web2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit154, Lit134, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit155, Lit134, Boolean.FALSE);
                }
                runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static Object lambda3() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "EA_WIFI_CAR", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Lit6, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "EA_WIFI_CAR", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit9, Lit10, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "fade", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit12, "EA_LOGO.png", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "fade", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "portrait", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "NodeMCU WiFi Robot Control", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.FALSE, Lit17);
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit19, Lit5, Lit6, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit19, Lit9, Lit20, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit19, Lit21, Lit22, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit19, Lit23, "01_ealogogr.jpg", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit19, Lit24, Lit25, Lit7);
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit19, Lit5, Lit6, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit19, Lit9, Lit20, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit19, Lit21, Lit22, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit19, Lit23, "01_ealogogr.jpg", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit19, Lit24, Lit25, Lit7);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit28, Lit5, Lit6, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit9, Lit29, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit21, Lit30, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit28, Lit24, Lit25, Lit7);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit28, Lit5, Lit6, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit9, Lit29, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit21, Lit30, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit28, Lit24, Lit25, Lit7);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit33, Lit34, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit35, Lit36, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit37, Lit6, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit21, Lit38, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit39, "INSERT CAR IP ADDRESS", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit40, Lit41, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit33, Lit24, Lit25, Lit7);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit33, Lit34, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit35, Lit36, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit37, Lit6, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit21, Lit38, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit39, "INSERT CAR IP ADDRESS", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit40, Lit41, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit33, Lit24, Lit25, Lit7);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit44, Lit9, Lit45, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit44, Lit21, Lit46, Lit7);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit44, Lit9, Lit45, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit44, Lit21, Lit46, Lit7);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit49, Lit5, Lit6, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit9, Lit50, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit21, Lit51, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit49, Lit24, Lit25, Lit7);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit49, Lit5, Lit6, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit9, Lit50, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit21, Lit51, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit49, Lit24, Lit25, Lit7);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit54, Lit9, Lit55, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit34, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit35, Lit56, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit37, Lit6, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit21, Lit57, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit39, "0.0.0.0", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit40, Lit41, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit58, Lit59, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit24, Lit25, Lit7);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit54, Lit9, Lit55, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit34, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit35, Lit56, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit37, Lit6, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit21, Lit57, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit39, "0.0.0.0", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit40, Lit41, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit58, Lit59, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit24, Lit25, Lit7);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit62, Lit63, Lit6, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit62, Lit21, Lit64, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit62, Lit65, Lit6, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit62, Lit24, Lit66, Lit7);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit62, Lit63, Lit6, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit62, Lit21, Lit64, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit62, Lit65, Lit6, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit62, Lit24, Lit66, Lit7);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit69, Lit9, Lit70, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit69, Lit71, Lit72, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit69, Lit34, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit69, Lit35, Lit73, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit69, Lit21, Lit74, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit69, Lit23, "left_arrow.png", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit69, Lit75, Lit41, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit69, Lit58, Lit76, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit69, Lit24, Lit77, Lit7);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit69, Lit9, Lit70, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit69, Lit71, Lit72, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit69, Lit34, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit69, Lit35, Lit73, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit69, Lit21, Lit74, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit69, Lit23, "left_arrow.png", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit69, Lit75, Lit41, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit69, Lit58, Lit76, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit69, Lit24, Lit77, Lit7);
    }

    public Object left$Click() {
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit79, Lit80, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("http://", runtime.callYailPrimitive(strings.string$Mnappend, LList.list2(runtime.getProperty$1(Lit54, Lit39), "/left"), Lit81, "join")), Lit82, "join"), Lit4);
        return runtime.callComponentMethod(Lit79, Lit83, LList.Empty, LList.Empty);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit87, Lit9, Lit88, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit71, Lit41, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit34, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit35, Lit89, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit21, Lit90, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit23, "stop.png", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit75, Lit41, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit58, Lit91, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit87, Lit24, Lit92, Lit7);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit87, Lit9, Lit88, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit71, Lit41, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit34, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit35, Lit89, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit21, Lit90, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit23, "stop.png", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit75, Lit41, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit87, Lit58, Lit91, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit87, Lit24, Lit92, Lit7);
    }

    public Object stop$Click() {
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit79, Lit80, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("http://", runtime.callYailPrimitive(strings.string$Mnappend, LList.list2(runtime.getProperty$1(Lit54, Lit39), "/stop"), Lit94, "join")), Lit95, "join"), Lit4);
        return runtime.callComponentMethod(Lit79, Lit83, LList.Empty, LList.Empty);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit98, Lit9, Lit99, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit98, Lit71, Lit41, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit98, Lit34, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit98, Lit35, Lit100, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit98, Lit21, Lit101, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit98, Lit23, "forward_arrow.png", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit98, Lit75, Lit72, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit98, Lit39, " ", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit98, Lit58, Lit102, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit98, Lit24, Lit103, Lit7);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit98, Lit9, Lit99, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit98, Lit71, Lit41, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit98, Lit34, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit98, Lit35, Lit100, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit98, Lit21, Lit101, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit98, Lit23, "forward_arrow.png", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit98, Lit75, Lit72, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit98, Lit39, " ", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit98, Lit58, Lit102, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit98, Lit24, Lit103, Lit7);
    }

    public Object forward$Click() {
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit79, Lit80, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("http://", runtime.callYailPrimitive(strings.string$Mnappend, LList.list2(runtime.getProperty$1(Lit54, Lit39), "/forward"), Lit105, "join")), Lit106, "join"), Lit4);
        return runtime.callComponentMethod(Lit79, Lit83, LList.Empty, LList.Empty);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit109, Lit9, Lit110, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit109, Lit71, Lit111, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit109, Lit34, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit109, Lit35, Lit112, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit109, Lit21, Lit113, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit109, Lit23, "right_arrow.png", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit109, Lit75, Lit41, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit109, Lit58, Lit114, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit109, Lit24, Lit115, Lit7);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit109, Lit9, Lit110, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit109, Lit71, Lit111, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit109, Lit34, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit109, Lit35, Lit112, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit109, Lit21, Lit113, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit109, Lit23, "right_arrow.png", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit109, Lit75, Lit41, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit109, Lit58, Lit114, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit109, Lit24, Lit115, Lit7);
    }

    public Object right$Click() {
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit79, Lit80, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("http://", runtime.callYailPrimitive(strings.string$Mnappend, LList.list2(runtime.getProperty$1(Lit54, Lit39), "/right"), Lit117, "join")), Lit118, "join"), Lit4);
        return runtime.callComponentMethod(Lit79, Lit83, LList.Empty, LList.Empty);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit121, Lit9, Lit122, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit121, Lit71, Lit41, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit121, Lit34, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit121, Lit35, Lit89, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit121, Lit21, Lit123, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit121, Lit23, "backward_arrow.png", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit121, Lit75, Lit111, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit121, Lit58, Lit124, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit121, Lit24, Lit125, Lit7);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit121, Lit9, Lit122, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit121, Lit71, Lit41, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit121, Lit34, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit121, Lit35, Lit89, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit121, Lit21, Lit123, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit121, Lit23, "backward_arrow.png", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit121, Lit75, Lit111, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit121, Lit58, Lit124, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit121, Lit24, Lit125, Lit7);
    }

    public Object backward$Click() {
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit79, Lit80, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("http://", runtime.callYailPrimitive(strings.string$Mnappend, LList.list2(runtime.getProperty$1(Lit54, Lit39), "/backward"), Lit127, "join")), Lit128, "join"), Lit4);
        return runtime.callComponentMethod(Lit79, Lit83, LList.Empty, LList.Empty);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit131, Lit71, Lit72, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit131, Lit75, Lit72, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit131, Lit39, "cam", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit131, Lit24, Lit132, Lit7);
    }

    static Object lambda29() {
        runtime.setAndCoerceProperty$Ex(Lit131, Lit71, Lit72, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit131, Lit75, Lit72, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit131, Lit39, "cam", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit131, Lit24, Lit132, Lit7);
    }

    public Object camera$Click() {
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit134, Lit80, runtime.getProperty$1(Lit135, Lit39), Lit4);
        return runtime.callComponentMethod(Lit136, Lit137, LList.list1(runtime.getProperty$1(Lit134, Lit80)), Lit138);
    }

    static Object lambda30() {
        runtime.setAndCoerceProperty$Ex(Lit135, Lit71, Lit111, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit135, Lit141, "Hint for TextBox1", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit135, Lit75, Lit111, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit135, Lit24, Lit142, Lit7);
    }

    static Object lambda31() {
        runtime.setAndCoerceProperty$Ex(Lit135, Lit71, Lit111, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit135, Lit141, "Hint for TextBox1", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit135, Lit75, Lit111, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit135, Lit24, Lit142, Lit7);
    }

    public void onCreate(Bundle icicle) {
        AppInventorCompatActivity.setClassicModeFromYail(true);
        super.onCreate(icicle);
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & 1;
        if (x) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (!x) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = lists.cons(lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        boolean x;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this == componentObject) {
                    x = true;
                } else {
                    x = false;
                }
                if (x ? IsEqual.apply(eventName, "PermissionNeeded") : x) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
                return false;
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
                return false;
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    public void $define() {
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Screen1 = this;
        addToFormEnvironment(Lit0, this);
        Object obj = this.events$Mnto$Mnregister;
        while (obj != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj2 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj2, apply12 == null ? null : apply12.toString());
                obj = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj);
            }
        }
        addToGlobalVars(Lit2, lambda$Fn1);
        Screen1 closureEnv = this;
        obj = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
        while (obj != LList.Empty) {
            try {
                arg0 = (Pair) obj;
                Object var$Mnval = arg0.getCar();
                Object var = lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(lists.cadr.apply1(var$Mnval)));
                obj = arg0.getCdr();
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, obj);
            } catch (ClassCastException e22) {
                throw new WrongType(e22, "arg0", -2, obj);
            } catch (ClassCastException e222) {
                throw new WrongType(e222, "add-to-form-environment", 0, component$Mnname);
            } catch (ClassCastException e3) {
                throw new WrongType(e3, "lookup-in-form-environment", 0, apply1);
            } catch (ClassCastException e2222) {
                throw new WrongType(e2222, "arg0", -2, obj);
            } catch (ClassCastException e22222) {
                throw new WrongType(e22222, "arg0", -2, obj);
            } catch (ClassCastException e222222) {
                throw new WrongType(e222222, "add-to-global-var-environment", 0, var);
            } catch (ClassCastException e2222222) {
                throw new WrongType(e2222222, "arg0", -2, obj);
            } catch (YailRuntimeError exception2) {
                processException(exception2);
                return;
            }
        }
        obj = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            misc.force(arg0.getCar());
            obj = arg0.getCdr();
        }
        LList component$Mndescriptors = lists.reverse(this.components$Mnto$Mncreate);
        closureEnv = this;
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            Object component$Mninfo = arg0.getCar();
            Object component$Mnname = lists.caddr.apply1(component$Mninfo);
            lists.cadddr.apply1(component$Mninfo);
            Object component$Mnobject = Invoke.make.apply2(lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) lists.car.apply1(component$Mninfo)));
            SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
            addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
            obj = arg0.getCdr();
        }
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            component$Mninfo = arg0.getCar();
            lists.caddr.apply1(component$Mninfo);
            Boolean init$Mnthunk = lists.cadddr.apply1(component$Mninfo);
            if (init$Mnthunk != Boolean.FALSE) {
                Scheme.applyToArgs.apply1(init$Mnthunk);
            }
            obj = arg0.getCdr();
        }
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            component$Mninfo = arg0.getCar();
            component$Mnname = lists.caddr.apply1(component$Mninfo);
            lists.cadddr.apply1(component$Mninfo);
            callInitialize(SlotGet.field.apply2(this, component$Mnname));
            obj = arg0.getCdr();
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        Object car;
        LList symbols = LList.makeList(argsArray, 0);
        Procedure procedure = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Pair result = LList.Empty;
        Object arg0 = symbols;
        while (arg0 != LList.Empty) {
            try {
                Pair arg02 = (Pair) arg0;
                Object arg03 = arg02.getCdr();
                car = arg02.getCar();
                try {
                    result = Pair.make(misc.symbol$To$String((Symbol) car), result);
                    arg0 = arg03;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, arg0);
            }
        }
        car = procedure.apply2(moduleMethod, LList.reverseInPlace(result));
        try {
            return misc.string$To$Symbol((CharSequence) car);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, car);
        }
    }

    static Object lambda2() {
        return null;
    }
}
