package com.battleground.battle.battleofmesa.services;

import com.battleground.battle.battleofmesa.entity.Item;

public interface IGameStateService {

    public Item create(Item item);
    public boolean delete(Item item);
    public Item getById(Long id);
    public Iterable<Item>  getAll();

}
