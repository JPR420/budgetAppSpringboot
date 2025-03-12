package com.example.budgetApp.CRUD.Services;

import com.example.budgetApp.CRUD.Command;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class deleteService implements Command<Void, String> {

    @Override
    public ResponseEntity<String> execute(Void input) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Deleted"); // Deleted body is not needed No_Content does not send the string

    }
}
