package demo;

import java.util.Locale;

public class ShowLoc {

  public static void main(String[] args) {
    Locale[] locs=Locale.getAvailableLocales();
    for(Locale loc:locs){
      System.out.println(loc+" "+loc.getDisplayName(loc));      
    }

  }

}
