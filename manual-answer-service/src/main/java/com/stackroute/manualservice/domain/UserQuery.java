package com.stackroute.manualservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("query")
public class UserQuery {

    @Id
    private String id;
    private String question;
    private String answer;
    private int status;

    public UserQuery(String id, String question, String answer, int status) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.status = status;
    }

    public UserQuery() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

