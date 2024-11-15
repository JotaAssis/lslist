package com.jotaassis.lslist.controllers;

import com.jotaassis.lslist.dto.GameDTO;
import com.jotaassis.lslist.dto.GameListDTO;
import com.jotaassis.lslist.dto.GameMinDTO;
import com.jotaassis.lslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findALl();
        return result;
    }


}
