package interceptor;

import java.util.Date;

import org.slf4j.*;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import controller.MyAction;

public class AssignDateInterceptor extends AbstractInterceptor {
  private final static Logger logger=LoggerFactory.getLogger(AssignDateInterceptor.class);
  @Override
  public String intercept(ActionInvocation invocation) throws Exception {
    MyAction action=(MyAction)invocation.getAction();
    logger.debug("before set date {}",action.getDate());
    action.setDate(new Date());
    logger.debug("after  set date {}",action.getDate());
    return invocation.invoke();
  }

}
