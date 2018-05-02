package dao;
import java.util.*;

import domain.Stu;
public interface StuDAO {
   public boolean check(String username,String pass) throws Exception;
   public List<String[]> getAllStus() throws Exception;
   Stu findById(long id) throws Exception;
   boolean save(Stu stu) throws Exception;
   boolean delById(long id) throws Exception;
   boolean update(Stu stu) throws Exception;
}
