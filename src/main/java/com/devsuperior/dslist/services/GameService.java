package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

//Registra o componente (Component ou Service)
@Service
public class GameService {

    //Injetando o component para que a camada de serviço tenha acesso ao componente
    @Autowired
    private GameRepository gameRepository;

    public List<Game> findAll() {
        
        //var result = gameRepository.findAll();
        List<Game> result = gameRepository.findAll();
        return result;
    }
}