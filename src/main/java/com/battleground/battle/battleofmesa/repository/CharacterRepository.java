package com.battleground.battle.battleofmesa.repository;

import com.battleground.battle.battleofmesa.entity.GameCharacter;
import org.springframework.data.repository.CrudRepository;

public interface CharacterRepository extends CrudRepository<GameCharacter, Long> {

}
