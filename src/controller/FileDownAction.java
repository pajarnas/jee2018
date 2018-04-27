package controller;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileDownAction extends ActionSupport {
    String downFilePath;
    String fileName;
    String contentType;
    
    public String getDownFilePath() {
      return downFilePath;
    }
    public void setDownFilePath(String downFilePath) {
      this.downFilePath = downFilePath;
    }
    public void setFileName(String fileName) {
      this.fileName = fileName;
    }
    public void setContentType(String contentType) {
      this.contentType = contentType;
    }
    
    
    public String getFileName() {
      return fileName;
    }
    public String getContentType() {
      return contentType;
    }
    public InputStream getFileStream(){
      return ServletActionContext.getServletContext().getResourceAsStream(downFilePath);
    }
}
