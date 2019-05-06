package cn.com.feiqun.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;

/**
 * @author feiqun
 * @date 2019/4/29 17:12
 * @desc
 */
public class BaseDaoImpl <T,ID> {

    @Autowired
    SimpleMongoRepository<T, ID> simpleMongoRepository;


}
