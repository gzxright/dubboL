package demo.service.user;


import demo.service.api.DataResult;
import demo.service.api.user.User;
import demo.service.api.user.UserRestService;
import demo.service.api.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by yangjunming on 2/25/16.
 * author: yangjunming@huijiame.com
 */
@Service("userRestService")
public class UserRestServiceImpl implements UserRestService {

    @Resource(name = "userService")
    UserService userService;

    @Override
    public String ping() {
        return userService.ping();
    }

    @Override
    public DataResult<User> registerUser(User u) {
        return userService.registerUser(u);
    }

    @Override
    public DataResult<User> getUserById(@Min(1L) Long userId) {
        return userService.getUserById(userId);
    }

    @Override
    public DataResult<Boolean> deleteUserById(Long userId) {
        return userService.deleteUserById(userId);
    }

    @Override
    public DataResult<Boolean> updatePassword(@Min(1L) Long userId, @NotNull String oldPwd, @NotNull String newPwd) {
        return userService.updatePassword(userId, oldPwd, newPwd);
    }

    @Override
    public DataResult<Boolean> get() {
        return new DataResult<Boolean>(true);
    }

    @Override
    public DataResult<Boolean> post() {
        return new DataResult<Boolean>(true);
    }
}
