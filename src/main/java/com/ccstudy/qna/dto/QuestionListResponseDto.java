package com.ccstudy.qna.dto;

import com.ccstudy.qna.domain.Question;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Getter
public class QuestionListResponseDto {

    private int questionNo;
    private String title;
    private String author;
    private String registerDate;
    private String updateDate;

    public QuestionListResponseDto(Question entity, int index) {
        this.questionNo = index;
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.registerDate = toStringDate(entity.getRegisterDate());
        this.updateDate = toStringDate(entity.getUpdateDate());
    }

    private String toStringDate(LocalDateTime dateTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return Optional.ofNullable(dateTime)
                .map(dateTimeFormatter::format)
                .orElse("");
    }
}
