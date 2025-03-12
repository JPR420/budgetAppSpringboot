package com.example.budgetApp.CRUD;

import com.example.budgetApp.CRUD.SQL.User;
import com.example.budgetApp.CRUD.Services.CreateService;
import com.example.budgetApp.CRUD.Services.deleteService;
import com.example.budgetApp.CRUD.Services.getService;
import com.example.budgetApp.CRUD.Services.updateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    private final CreateService createService;

    private final getService getService;

    private final updateService updateService;

    private final deleteService deleteService;

    public MyRestController(CreateService createService, com.example.budgetApp.CRUD.Services.getService getService, com.example.budgetApp.CRUD.Services.updateService updateService, com.example.budgetApp.CRUD.Services.deleteService deleteService) {
        this.createService = createService;
        this.getService = getService;
        this.updateService = updateService;
        this.deleteService = deleteService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> create() {
        return createService.execute(null);
    }

    @GetMapping("/get")
    public ResponseEntity<List<User>>get() {
        return getService.execute(null);
    }

    @PutMapping("/update")
    public ResponseEntity<String> update() {
        return updateService.execute(null);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String>delete() {
        return deleteService.execute(null);
    }
}

