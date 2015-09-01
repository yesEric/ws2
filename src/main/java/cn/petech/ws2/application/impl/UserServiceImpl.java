package cn.petech.ws2.application.impl;

import cn.petech.ws2.application.UserService;
import cn.petech.ws2.domain.model.user.User;
import cn.petech.ws2.domain.model.user.UserRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    protected final Log log = LogFactory.getLog(getClass());
    UserRepository userRepository;
    @Override
    public User createNewUser(String username, String password, boolean enable) {
        User user=new User(username,password,enable);
        user=userRepository.save(user);
        log.debug("User has been saved!");
        return user;
    }
}
