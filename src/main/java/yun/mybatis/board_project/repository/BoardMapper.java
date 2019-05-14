package yun.mybatis.board_project.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import yun.mybatis.board_project.model.Board;

import java.util.List;

@Mapper
@Component
public interface BoardMapper {
    Board selectBoardById(Long id);

    List<Board> selectAllBoard();

    void insertBoard(Board board);

    void updateBoard(Long id, String title, String content);
}
