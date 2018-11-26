package com.battleground.battle.battleofmesa.controller;

import com.battleground.battle.battleofmesa.BattleofmesaApplication;
import com.battleground.battle.battleofmesa.entity.Item;
import com.battleground.battle.battleofmesa.services.IGameStateService;
import com.battleground.battle.battleofmesa.services.implementation.GameStateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/gameservice/object")
public class GameStateController {

    @Autowired
    IGameStateService gameStateService;

    @Autowired
    BattleofmesaApplication battleOfMesaApplication;


    public GameStateController(IGameStateService gameStateService)
    {
        this.gameStateService = gameStateService;
    }

    @RequestMapping(value="/create/{itemname}", method= RequestMethod.POST )
    public Item createItem(@PathVariable("itemname") String itemname)
    {
        return gameStateService.create(battleOfMesaApplication.getItemBean(itemname));
    }

    @RequestMapping(value="/update/item",method=RequestMethod.PUT)
    public Item updateItem(@PathVariable("item") Item item)
    {

        return gameStateService.create(item);
    }

    @RequestMapping(value="/get/{name}/{id}", method=RequestMethod.GET)
    public Item get(@PathVariable( "name") String name, @PathVariable("id") Long id)
    {

        return gameStateService.getById(name,id);
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
