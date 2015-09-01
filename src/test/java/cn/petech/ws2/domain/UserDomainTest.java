package cn.petech.ws2.domain;

import cn.petech.ws2.domain.model.user.User;
import cn.petech.ws2.domain.model.user.UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.*;
public class UserDomainTest extends BaseDomainTestCase {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testCreateUser() throws Exception{
        User user=new User("Eric","111",true);
        user=userRepository.save(user);
        assertNotNull(user.id());

    }
}
