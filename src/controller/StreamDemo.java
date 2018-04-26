package controller;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class StreamDemo extends ActionSupport {
   public InputStream getTxtStream(){
     //return new ByteArrayInputStream("helloworld".getBytes());
     return ServletActionContext.getServletContext().getResourceAsStream("/河南市县名.txt");
   }
}
