package com.battleground.battle.battleofmesa.repository;

import com.battleground.battle.battleofmesa.entity.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameStateRepository extends CrudRepository<Item, Long> {
}
