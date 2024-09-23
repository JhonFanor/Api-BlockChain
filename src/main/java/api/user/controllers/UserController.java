package api.user.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.user.entities.UserEntitie;
import api.user.services.UserService;

@RestController
@RequestMapping(value = "/api/notification")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping(path = "/create")
    public ResponseEntity<UserEntitie> create(@RequestBody UserEntitie user){
        return ResponseEntity.ok(userService.create(user)); 
    }

    @GetMapping(path = "/getAll")
    public ResponseEntity<List<UserEntitie>> getAll(){
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping(path = "/get/{id}")
    public ResponseEntity<UserEntitie> get(@PathVariable Long id){
        return ResponseEntity.ok(userService.get(id).get());
    }

    @PostMapping(path = "/update/{id}")
    public ResponseEntity<UserEntitie> update(@RequestBody UserEntitie user, @PathVariable Long id){
        return ResponseEntity.ok(userService.update(user,id)); 
    }

    @GetMapping(path = "/get/{id}")
    public ResponseEntity<UserEntitie> delete(@PathVariable Long id){
        return ResponseEntity.ok(userService.delete(id));
    }
}
