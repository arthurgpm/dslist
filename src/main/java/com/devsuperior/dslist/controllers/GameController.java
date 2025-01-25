package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.services.GameService;

//Configura a Classe para ser um Controlador
@RestController
//Configura o recurso para a API/Controlador
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    
    //Endpoint para Obter|GET (Exemplo1)
    
    /*
    @GetMapping
    public List<Game> findAll() {
    List<Game> result = gameService.findAll();
    return result;
     */
    
    //Endpoint para Obter|GET (Exemplo2)

    /*
    @GetMapping
    public List<GameMinDTO> findAll() {
    List<Game> result = gameService.findAll();
    List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
    return dto;
     */
    
    //Endpoint para Obter|GET (Exemplo3)

    @GetMapping
    public List<GameMinDTO> findAll() {
    List<Game> result = gameService.findAll();
    return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
