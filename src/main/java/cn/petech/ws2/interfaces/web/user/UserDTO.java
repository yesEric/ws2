package cn.petech.ws2.interfaces.web.user;


import java.io.Serializable;

public class UserDTO implements Serializable{

    private Long id;
    private String username;
    private String password;
    private boolean enable;

    public UserDTO(Long id, String username, String password, boolean enable) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.enable = enable;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isEnable() {
        return enable;
    }
}
