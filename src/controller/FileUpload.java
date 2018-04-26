package controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;


import org.apache.struts2.ServletActionContext;
import org.slf4j.*;

import com.opensymphony.xwork2.ActionSupport;

public class FileUpload extends ActionSupport {
  final static Logger logger=LoggerFactory.getLogger(FileUpload.class);
  File upload;
  String uploadFileName;
  String uploadContentType;
  String downFilePath;
  public File getUpload() {
    return upload;
  }
  public void setUpload(File upload) {
    this.upload = upload;
  }
  public String getUploadFileName() {
    return uploadFileName;
  }
  public void setUploadFileName(String uploadFileName) {
    this.uploadFileName = uploadFileName;
  }
  public String getUploadContentType() {
    return uploadContentType;
  }
  public void setUploadContentType(String uploadContentType) {
    this.uploadContentType = uploadContentType;
  }
  
  public String getDownFilePath() {
    return downFilePath;
  }
  @Override public String execute(){    
    String uploadPath=ServletActionContext.getServletContext().getRealPath("/upload");
    File destFile=new File(uploadPath,uploadFileName);
	System.out.println(destFile);
    try{
      Files.copy(upload.toPath(),destFile.toPath(),StandardCopyOption.REPLACE_EXISTING);
      downFilePath="upload/"+uploadFileName;
    }catch(Exception ex){
	  ex.printStackTrace();
      return ERROR;
    }
    return SUCCESS;
  }
  
}
