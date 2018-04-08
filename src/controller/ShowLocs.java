package controller;

import java.util.*;
import java.util.Locale;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class ShowLocs extends ActionSupport {
  Locale[] locs;
  
  public Locale[] getLocs() {
    return locs;
  }

  public void setLocs(Locale[] locs) {
    this.locs = locs;
  }
  SortedMap<String, String> locsMap=new TreeMap<>();
  
  public SortedMap<String, String> getLocsMap() {
    return locsMap;
  }

  public void setLocsMap(SortedMap<String, String> locsMap) {
    this.locsMap = locsMap;
  }

  @Override public String execute(){
      locs=Locale.getAvailableLocales();
      for(Locale loc:locs){
        locsMap.put(loc.getDisplayName(),loc.getCountry()+"_"+loc.getLanguage());
      }
      return SUCCESS;
    }
}
