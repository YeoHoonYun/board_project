package yun.mybatis.board_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yun.mybatis.board_project.model.User;
import yun.mybatis.board_project.repository.UserMapper;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User selectUserById(Long id){
        return userMapper.selectUserById(id);
    }

    public List<User> selectAllUser(){
        return userMapper.selectAllUser();
    }

    public void insertUser(User user){
        userMapper.insertUser(user);
    }
}
