package mongo;

import cn.com.feiqun.Application;
import cn.com.feiqun.user.dao.MongodbLocationDao;
import cn.com.feiqun.user.dao.MongodbUserDao;
import cn.com.feiqun.user.obj.Location;
import cn.com.feiqun.user.obj.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author feiqun
 * @date 2019/4/29 15:09
 * @desc
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class Mongo {

    @Autowired
    MongodbUserDao mongodbUserDao;
    @Autowired
    MongodbLocationDao mongodbLocationDao;

    @Test
    public void test()   {
        mongodbUserDao.deleteAll();

        mongodbUserDao.save(new User("feiqun", 28));
        mongodbUserDao.save(new User("wangcan", 29));
        System.out.println(mongodbUserDao.findUserByName("wangcan"));
        System.out.println(mongodbUserDao.myFindAll());

        mongodbLocationDao.deleteAll();
        mongodbLocationDao.save(new Location("feiqun", 1.0, 2.0));
        System.out.println(mongodbLocationDao.findAll());

    }
}
