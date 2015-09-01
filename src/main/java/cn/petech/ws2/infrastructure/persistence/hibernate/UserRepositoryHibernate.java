package cn.petech.ws2.infrastructure.persistence.hibernate;

import cn.petech.ws2.domain.model.user.User;
import cn.petech.ws2.domain.model.user.UserRepository;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("userRepository")
public class UserRepositoryHibernate extends GenericRepositoryHibernate<User,Long> implements UserRepository {
    public UserRepositoryHibernate() {
        super(User.class);
    }

    @Override
    public User findByUsername(String username) {
        List<User> users=this.getSession().createCriteria(User.class).add(Restrictions.eq("username",username)).list();
        if(users!=null && !users.isEmpty()){
            return users.get(0);
        }
        return null;
    }


}
