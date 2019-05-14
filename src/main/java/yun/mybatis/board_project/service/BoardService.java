package yun.mybatis.board_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yun.mybatis.board_project.model.Board;
import yun.mybatis.board_project.repository.BoardMapper;

import java.util.List;

@Service
@Transactional
public class BoardService {
    @Autowired
    BoardMapper boardMapper;

    public Board selectBoardById(Long id){
        return boardMapper.selectBoardById(id);
    }

    public List<Board> selectAllBoard(){
        return boardMapper.selectAllBoard();
    }
    public void insertBoard(Board board){
        boardMapper.insertBoard(board);
    }

    public void updateBoard(Long id, String title, String content){
        boardMapper.updateBoard(id, title, content);
    }
}
