package com.cezarNegreiros.compras.resources;

import com.cezarNegreiros.compras.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll(){
         User u = new User(1L, "Cezar", "Cezar@gmail.com",
                "92 99240-1143", "12345");
        return ResponseEntity.ok().body(u);
    }
}
