package yun.mybatis.board_project.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias(value = "role")
public class Role {
    Long id;
    String role;
    String email;

    public Role(String role) {
        this.role = role;
    }
}
