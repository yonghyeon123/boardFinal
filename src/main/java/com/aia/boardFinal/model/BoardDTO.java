package com.aia.boardFinal.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class BoardDTO {
    private int id;
    private String title;
    private String content;
    private int writerId;
    private Timestamp modifyDate;
    private Timestamp entryDate;
}
