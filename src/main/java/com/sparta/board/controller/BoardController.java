package com.sparta.board.controller;


import com.sparta.board.dto.BoardRequestDto;
import com.sparta.board.dto.BoardResponseDto;
import com.sparta.board.service.BoardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BoardController {

    private final BoardService boardService;
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("/boards") //게시글 작성
    public BoardResponseDto createBoard(@RequestBody BoardRequestDto requestDto) {
        return boardService.createBoard(requestDto);
    }

    @GetMapping("/boards") // 게시글 목록 조회
    public List<BoardResponseDto> getBoards() {
        return boardService.getBoards();
    }

    @PutMapping("/boards/{id}") // 게시글 수정
    public Long updateBoard(@PathVariable Long id, @RequestBody BoardRequestDto requestDto) {
        return boardService.updateBoard(id, requestDto);
    }

    @DeleteMapping("/boards/{id}") // 게시글 삭제
    public Long deleteBoard(@PathVariable Long id) {
        return boardService.deleteBoard(id);
    }
}
