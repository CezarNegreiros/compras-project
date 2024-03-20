package com.cezarNegreiros.compras.services;

import com.cezarNegreiros.compras.entities.User;
import com.cezarNegreiros.compras.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //Registra a classe como um componente do Spring, permitindo a injeção com Autowired
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findall(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }
}
