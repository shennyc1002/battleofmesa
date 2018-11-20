package com.battleground.battle.battleofmesa.controller;

import com.battleground.battle.battleofmesa.BattleofmesaApplication;
import com.battleground.battle.battleofmesa.entity.Item;
import com.battleground.battle.battleofmesa.services.IGameStateService;
import com.battleground.battle.battleofmesa.services.implementation.GameStateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/gameservice/object")
public class GameStateController {

    IGameStateService gameStateService;

    @Autowired
    BattleofmesaApplication battleOfMesaApplication;

    @Autowired
    public GameStateController(IGameStateService gameStateService)
    {
        this.gameStateService = gameStateService;
    }

    @RequestMapping(value="/create/{itemName}", method= RequestMethod.POST )
    public Item createItem(@PathParam("itemname") String itemName)
    {
        return gameStateService.create(battleOfMesaApplication.getItemBean(itemName));


    }

    @RequestMapping(value="/update/itemName",method=RequestMethod.PUT)
    public Item updateItem(@PathParam("itemName") Item item)
    {

        return gameStateService.create(item);
    }

    @RequestMapping(value="/get/{id}", method=RequestMethod.GET)
    public Item get(@PathParam("id") Long id)
    {
        return gameStateService.getById(id);
    }

   /* @RequestMapping(value="/get/{name}", method=RequestMethod.GET)
    public Item get(@PathParam("name") String name)
    {
        return gameStateService.getById(name);
    }*/

    @RequestMapping(value="/get", method=RequestMethod.GET)
    public Iterable<Item> get()
    {
        return gameStateService.getAll();
    }

}
