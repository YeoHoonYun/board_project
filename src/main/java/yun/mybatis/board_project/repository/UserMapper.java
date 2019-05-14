package yun.mybatis.board_project.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import yun.mybatis.board_project.model.Board;
import yun.mybatis.board_project.model.User;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    User selectUserById(Long id);

    List<User> selectAllUser();

    void insertUser(User user);
}
