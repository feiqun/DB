package mongo;

import cn.com.feiqun.Application;
import cn.com.feiqun.inter.UserRepository;
import cn.com.feiqun.obj.User;
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
    UserRepository userRepository;

    @Test
    public void test() {
        userRepository.deleteAll();
        System.out.println(userRepository.save(new User("cn/com/feiqun", 29)));
        System.out.println(userRepository.save(new User("wangcan", 29)));
        System.out.println(userRepository.findUserByName("wangcan"));
//        userRepository.delete(new User("cn/com/feiqun", 29));

    }
}
