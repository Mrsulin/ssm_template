package club.sulinxx.mapper;

import club.sulinxx.pojo.User;

import java.util.List;

/**
 * Title: UserMapper
 *
 * @author sulin
 * @date 2019-07-17
 */

public interface UserMapper {
     User selectOne();
     List<User> selectAllUser();
}
