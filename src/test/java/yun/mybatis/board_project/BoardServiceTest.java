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
import yun.mybatis.board_project.model.City;
import yun.mybatis.board_project.service.BoardService;
import yun.mybatis.board_project.service.CityService;

import java.util.List;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional(transactionManager = "transactionManager")
@Commit
public class BoardServiceTest extends DefaultTransactionDefinition {
    @Autowired
    BoardService boardService;

    @Test
    public void getBoardById() {
        Board board = boardService.selectBoardById(1L);
        System.out.println("TEST : " + board);
    }

    @Test
    public void getAllBoard() {
        List<Board> boardList = boardService.selectAllBoard();
        System.out.println(boardList);
        for(Board board : boardList){
            System.out.println(board.getRegDate());
        }
    }


    @Test
    public void addBoards() {
        boardService.insertBoard(new Board(1L, "세번째 글입니다.", "세번째 글의 내용입니다."));
    }
}
