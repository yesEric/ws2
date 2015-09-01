package cn.petech.ws2.application;


import cn.petech.ws2.domain.model.user.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public interface UserService {


    public User createNewUser(String username,String password,boolean enable);

}
