package com.example.budgetApp.CRUD;

import com.example.budgetApp.CRUD.SQL.User;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository <User, Integer> {


}
