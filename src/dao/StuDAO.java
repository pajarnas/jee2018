package dao;
import java.util.*;
public interface StuDAO {
   public boolean check(String username,String pass) throws Exception;
   public List<String[]> getAllStus() throws Exception;
}
