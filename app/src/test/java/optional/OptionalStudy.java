package optional;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;


/**
 * @author feiqun
 * @date 2019/5/13 14:07
 * @desc java1.8 新特性之Optional
 */
@Slf4j
public class OptionalStudy {

    @Test
    public void orElse() {
        User user = null;
        User user2 = new User("anna@gmail.com", "feiqun");
        User result = Optional.ofNullable(user).orElse(user2);

        Assert.assertTrue(user2 == result);
    }

    @Test
    public void orElseGet() {
        User user = null;
        user = Optional.ofNullable(user).orElseGet(() -> createNewUser("anna@gmail.com", "feiqun"));

        Assert.assertTrue(user != null);
    }

    @Test
    public void orElseThrow() {
        try {
            User user = null;
            user = Optional.ofNullable(user).orElseThrow(() -> new Exception("用户不存在"));
        } catch (Exception e) {
            Assert.assertTrue(e.getMessage() != null);
        }

    }

    private User createNewUser(String id, String name) {
        return new User(id, name);
    }

    @Data
    private class User {

        private String id;
        private String name;

        public User(String id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}
