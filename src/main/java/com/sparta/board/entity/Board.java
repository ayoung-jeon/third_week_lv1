package com.sparta.board.entity;


import com.sparta.board.dto.BoardRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity  // JPA가 관리할 수 있는 Entity 클래스 지정
@Getter
@Setter
@Table(name = "board")  // 매핑할 테이블의 이름을 지정
@NoArgsConstructor
public class Board extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // id

    @Column(name = "title", nullable = false)
    private String title; // 제목

    @Column(name = "username", nullable = false)
    private String username; // 작성자명

    @Column(name = "password", nullable = false)
    private String password; // 비밀번호

    @Column(name = "contents", nullable = false, length = 500)
    private String contents; // 작성내용

    public Board(BoardRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.username = requestDto.getUsername();
        this.password = requestDto.getPassword();
        this.contents = requestDto.getContents();
    }

    public void update(BoardRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.username = requestDto.getUsername();
    //    this.password = requestDto.getPassword();
        this.contents = requestDto.getContents();
    }
}
