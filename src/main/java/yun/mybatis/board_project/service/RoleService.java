package yun.mybatis.board_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yun.mybatis.board_project.model.Role;
import yun.mybatis.board_project.repository.RoleMapper;

import java.util.List;

@Service
@Transactional
public class RoleService {
    @Autowired
    RoleMapper roleMapper;

    public List<Role> selectAllRole(){
        return roleMapper.selectAllRole();
    }

    public void insertRole(Role role){
        roleMapper.insertRole(role);
    }
}
