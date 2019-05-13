package cn.com.feiqun.user.dao;

import cn.com.feiqun.dao.MongodbBaseDaoImpl;
import cn.com.feiqun.user.obj.User;
import cn.com.feiqun.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author feiqun
 * @date 2019/5/13 15:53
 * @desc
 */
@Repository
public class MongodbUserDaoImpl extends MongodbBaseDaoImpl<User, String> implements MongodbUserDao {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> myFindAll() {
        return userRepository.findAll();
    }

    @Override
    public User findUserByName(String name) {
        return userRepository.findUserByName(name);
    }
}
