package yun.mybatis.board_project.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import yun.mybatis.board_project.model.Board;
import yun.mybatis.board_project.model.City;
import yun.mybatis.board_project.model.User;
import yun.mybatis.board_project.service.BoardService;
import yun.mybatis.board_project.service.CityService;

import java.util.List;

@Controller
@AllArgsConstructor
public class BoardController {

    BoardService boardService;

    @GetMapping(value = {"", "/", "/main"})
    public String main(Model model){
        List<Board> boardList = boardService.selectAllBoard();
        model.addAttribute("boardList",boardList);
        return "index";
    }

    @GetMapping(value = "/detail/{id}")
    public String detail(@PathVariable Long id, Model model){
        Board board = boardService.selectBoardById(id);
        model.addAttribute("board", board);
        return "detail";
    }

    @GetMapping(value = "/create")
    public String create(Model model){
        User user = new User(4L,"test@jiguem.com", "1234");
        model.addAttribute("user", user);
        return "create";
    }

    @GetMapping(value = "/update/{id}")
    public String update(@PathVariable Long id, Model model){
        Board board = boardService.selectBoardById(id);
        model.addAttribute("board", board);
        return "update";
    }

    @PostMapping(value = "/create")
    public String boardCreate(@RequestBody Board board){
        User user = new User(4L,"test@jiguem.com", "1234");
        boardService.insertBoard(new Board(user.getId(), board.getTitle(), board.getContent()));
        return "redirect::index";
    }

    @PostMapping(value = "/update")
    public String boardUpdate(
            @RequestParam(value = "id") Long id,
            @RequestParam(value = "title") String title,
            @RequestParam(value = "content") String content

    ){
        User user = new User(4L,"test@jiguem.com", "1234");
        boardService.updateBoard(id, title, content);
        return "redirect:detail/"+id.toString();
    }
}
