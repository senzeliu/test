package org.example.mybatis.mapper;

import org.example.mybatis.pojo.User;

import java.util.List;

/**
 * @author liusenze
 * @Description:
 * @since 2021/6/8 5:12 下午
 */
public interface UserMapper {

    List<User> selectAll();

    User selectById(int id);

    User selectByIdForUpdate(int id);

    void insert(User user);

    void update(User user);

    void delete(int id);

    List<User> selectAllWithBoss1();

    List<User> selectAllWithBoss2();

    List<User> selectAllWithBossAddress();
}
