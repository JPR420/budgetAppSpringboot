package com.example.budgetApp.CRUD.SQL;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //increment by 1
    @Column (name= "user_id")
    private Long id;

    @Column (name= "name")
    private String name;
    @Column (name= "email")
    private String email;
    @Column (name= "phone")
    private String phone;
    @Column (name= "username")
    private String username;
    @Column (name= "password")
    private String password;
    @Column (name= "security_question_1")
    private String question1;
    @Column (name= "security_answer_1")
    private String answer1;
    @Column (name= "security_question_2")
    private String question2;
    @Column (name= "security_answer_2")
    private String answer2;
    @Column (name= "preferences")
    private String preferences;

    public User() {}
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getQuestion1() {
        return question1;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getQuestion2() {
        return question2;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }
}
