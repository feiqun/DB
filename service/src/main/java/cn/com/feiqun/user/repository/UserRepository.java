package cn.com.feiqun.user.repository;


import cn.com.feiqun.user.obj.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author feiqun
 * @date 2019/4/29 15:28
 * @desc
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findUserByName(String name);
}
