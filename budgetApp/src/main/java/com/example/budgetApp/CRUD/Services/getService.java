package com.example.budgetApp.CRUD.Services;

import com.example.budgetApp.CRUD.Query;
import com.example.budgetApp.CRUD.Repository;
import com.example.budgetApp.CRUD.SQL.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class getService implements Query<Void, List<User>> {
    @Autowired
    private Repository repo;

    @Override
    public ResponseEntity<List<User>> execute(Void input) {
        List<User> services = repo.findAll();
        return  ResponseEntity.status(HttpStatus.OK).body(services);
    }
}
