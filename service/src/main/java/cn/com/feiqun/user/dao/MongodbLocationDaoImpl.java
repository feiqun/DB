package cn.com.feiqun.user.dao;

import cn.com.feiqun.dao.MongodbBaseDaoImpl;
import cn.com.feiqun.user.obj.Location;
import org.springframework.stereotype.Repository;

/**
 * @author feiqun
 * @date 2019/5/13 15:53
 * @desc
 */
@Repository
public class MongodbLocationDaoImpl extends MongodbBaseDaoImpl<Location, String> implements MongodbLocationDao {
}
