package cn.petech.ws2.domain.model.user;

import cn.petech.ws2.domain.shared.Entity;
import java.sql.Timestamp;


public class User implements Entity<User> {

    private Long id;
    private String username;
    private String password;
    private boolean enabled;
    private Timestamp createdAt;
    private Timestamp lastModified;

    public User() {
    }

    public User(String username, String password,boolean enabled) {
        this.username = username;
        this.password = password;
        this.enabled =enabled;
        this.lastModified=new Timestamp(System.currentTimeMillis());
        this.createdAt=new Timestamp(System.currentTimeMillis());
    }

    public Long id(){
        return  id;
    }

    User enable(){
        this.enabled=true;
        return this;
    }
    User disable(){
        this.enabled=false;
        return this;
    }
    public String username(){
        return username;
    }
    public Timestamp createdAt(){
        return createdAt;
    }
    public Timestamp lastModified(){
        return lastModified;
    }

    @Override
    public boolean sameIdentityAs(final User other) {
        return other!=null && id.equals(other.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!id.equals(user.id)) return false;
        return sameIdentityAs(user);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + username.hashCode();
        return result;
    }
}
