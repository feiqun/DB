package cn.com.feiqun.dao;

import cn.com.feiqun.inter.UserRepository;
import cn.com.feiqun.obj.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author feiqun
 * @date 2019/4/29 16:57
 * @desc
 */
@Repository
public class UserDao extends BaseDaoImpl<User,String>{

    @Autowired
    UserRepository userRepository;

    public User findUserByName(String name) {
        return userRepository.findUserByName(name);
    }

}
