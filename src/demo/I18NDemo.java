package demo;
import static java.lang.System.out;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
public class I18NDemo {

  public static void main(String[] args) {
    //inTw();
    //inCn();
    //noI18N();
    //i18n();
    //format();
    order();
  }
  public static void inTw(){
    out.println("學生");
    out.println("資訊");
  }
  public static void inCn(){
    out.println("学生");
    out.println("信息");
  }
  public static void noI18N(){
    Locale twLoc=new Locale("zh","tw");
    out.println(twLoc);
    Locale defaultLoc=Locale.getDefault();
    out.println(defaultLoc);
    String strLoc=defaultLoc.toString();
    if(strLoc.equals("zh_CN")) inCn();
    else if(strLoc.equals("zh_TW")) inTw();
    switch(strLoc){
      case "zh_CN":inCn();break;
      case "zh_TW":inTw();break;
      default:inCn();
    }
  } 
  public static void i18n(){
    Locale cnLoc=new Locale("zh","CN");
    Locale twLoc=new Locale("zh","TW");
    Locale enLoc=new Locale("en","US");
    ResourceBundle bundle=ResourceBundle.getBundle("demo.msg",enLoc);
    out.println(bundle.getString("id"));
  }
  public static void format(){
    long id=2L;
    String username="zhangsan";
    String info="学号是 "+id+"，姓名是 "+username;
    String info2="学号是{0}，姓名是{1}";
    String res=MessageFormat.format(info2, id,username);
    out.println(res);
  }
  public static void order(){
    Locale enLoc=new Locale("en","US");
    ResourceBundle bundle=ResourceBundle.getBundle("demo.msg",enLoc);
    //只有zh_CN，没有en_US资源，会从当前
    out.println(bundle.getString("val"));
    //zh_CN和en资源，会从en中找
    out.println(bundle.getString("id"));
  }
}
