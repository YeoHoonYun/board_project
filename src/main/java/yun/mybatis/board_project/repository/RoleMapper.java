package yun.mybatis.board_project.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import yun.mybatis.board_project.model.Board;
import yun.mybatis.board_project.model.Role;

import java.util.List;

@Mapper
@Repository
public interface RoleMapper {
    Role selectRoleById(Long id);

    List<Role> selectAllRole();

    void insertRole(Role role);
}
