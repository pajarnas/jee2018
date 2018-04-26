package controller;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class StreamDemo extends ActionSupport {
   public InputStream getTxtStream(){
     //return new ByteArrayInputStream("helloworld".getBytes());
     return ServletActionContext.getServletContext().getResourceAsStream("/ns_suc.jsp");
   }
   /**从类路径下找文件*/
   public InputStream getFileFromCp(){
     return getClass().getResourceAsStream("/struts.xml");
   }
}
