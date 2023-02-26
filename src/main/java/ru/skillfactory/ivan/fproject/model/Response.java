package ru.skillfactory.ivan.fproject.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Response implements Serializable {
    BigDecimal answer;
    String description;

    public void setAnswer(int answer) {
        this.answer = new BigDecimal(answer);
    }
    public void setAnswer(BigDecimal answer) {
        this.answer = answer;
    }
}
