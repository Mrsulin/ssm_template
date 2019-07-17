package club.sulinxx.service;

import club.sulinxx.mapper.UserMapper;
import club.sulinxx.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Title: UserServiceImpl
 *
 * @author sulin
 * @date 2019-07-17
 */
@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserMapper um;

    public void setUm(UserMapper um) {
        this.um = um;
    }

    public User selectOne() {
        return um.selectOne();
    }
}
