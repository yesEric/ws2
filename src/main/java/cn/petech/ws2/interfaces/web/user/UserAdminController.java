package cn.petech.ws2.interfaces.web.user;


import cn.petech.ws2.application.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserAdminController {

    @Autowired
    UserService userService;
    @RequestMapping("add")
    public String register(UserDTO userDTO){

        userService.createNewUser(userDTO.getUsername(),userDTO.getPassword(),userDTO.isEnable());

        return "index";
    }
}
