package yun.mybatis.board_project.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Getter
@Setter
@Alias(value = "board")
public class Board {
    Long id;
    String title;
    String content;
    Date regDate;

    public Board(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Board(Long id, String title, String content, Date regDate) {
        this(id, title, content);
        this.regDate = regDate;
    }
}
