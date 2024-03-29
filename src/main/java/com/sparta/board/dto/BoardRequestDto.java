package com.sparta.board.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BoardRequestDto {
    private String title;
    private String username;
    private String password;
    private String contents;

    public BoardRequestDto(String title, String username, String password, String contents) {
        this.title = title;
        this.username = username;
        this.password = password;
        this.contents = contents;
    }
}
