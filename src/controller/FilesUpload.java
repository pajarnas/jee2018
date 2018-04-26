package controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FilesUpload extends ActionSupport {
  File[] uploads;
  String[] uploadsFileName;
  String[] uploadsContentType;

  public File[] getUploads() {
    return uploads;
  }

  public void setUploads(File[] uploads) {
    this.uploads = uploads;
  }

  public String[] getUploadsFileName() {
    return uploadsFileName;
  }

  public void setUploadsFileName(String[] uploadsFileName) {
    this.uploadsFileName = uploadsFileName;
  }

  public String[] getUploadsContentType() {
    return uploadsContentType;
  }

  public void setUploadsContentType(String[] uploadsContentType) {
    this.uploadsContentType = uploadsContentType;
  }  

  @Override
  public String execute() {
    String uploadsPath = ServletActionContext.getServletContext().getRealPath("/upload");
    try {
      for (int i = 0; i < uploads.length; i++) {
        File destFile = new File(uploadsPath, uploadsFileName[i]);
        System.out.println(uploads[i].exists() + " ");
        Files.copy(uploads[i].toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      return ERROR;
    }
    return SUCCESS;
  }

}
