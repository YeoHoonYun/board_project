package yun.mybatis.board_project;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import yun.mybatis.board_project.model.Board;
import yun.mybatis.board_project.model.Role;
import yun.mybatis.board_project.service.BoardService;
import yun.mybatis.board_project.service.RoleService;

import java.util.List;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional(transactionManager = "transactionManager")
@Commit
public class RoleServiceTest extends DefaultTransactionDefinition {
    @Autowired
    RoleService roleService;

    @Test
    public void getAllRole() {
        List<Role> role = roleService.selectAllRole();
        System.out.println("TEST : " + role);
    }

    @Test
    public void addBoards() {
        roleService.insertRole(new Role("user"));
    }
}
