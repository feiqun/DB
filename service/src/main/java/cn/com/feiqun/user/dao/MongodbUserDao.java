package cn.com.feiqun.user.dao;

import cn.com.feiqun.dao.MongodbBaseDao;
import cn.com.feiqun.user.obj.User;

import java.util.List;

/**
 * @author feiqun
 * @date 2019/5/13 15:52
 * @desc
 */
public interface MongodbUserDao extends MongodbBaseDao<User, String> {
    List<User> myFindAll();

    User findUserByName(String name);
}
