package demo.service.user;

import demo.service.api.DataResult;
import demo.service.api.user.User;
import demo.service.api.user.UserService;
import org.springframework.stereotype.Service;
import java.util.Random;

/**
 * Created by yangjunming on 3/4/16.
 * author: yangjunming@huijiame.com
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public String ping() {
        return "pong";
    }

    @Override
    public DataResult<User> registerUser(User u) {
        Random rnd = new Random();
        u.setUserId(rnd.nextLong());
        return new DataResult<User>(u);
    }

    @Override
    public DataResult<User> getUserById(Long userId) {
        User u = new User();
        u.setUserId(userId);
        return new DataResult<User>(u);
    }

    @Override
    public DataResult<Boolean> deleteUserById(Long userId) {
        return new DataResult<Boolean>(false);
    }

    @Override
    public DataResult<Boolean> updatePassword(Long userId, String oldPwd, String newPwd) {
        return new DataResult<Boolean>(true);
    }
}
