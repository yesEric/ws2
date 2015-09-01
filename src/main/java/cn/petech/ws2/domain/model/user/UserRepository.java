package cn.petech.ws2.domain.model.user;

import cn.petech.ws2.domain.shared.GenericRepository;

;

public interface UserRepository extends GenericRepository<User,Long>{

    User findByUsername(String username);


}
