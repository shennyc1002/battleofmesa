package com.battleground.battle.battleofmesa.repository;

import com.battleground.battle.battleofmesa.entity.GameCharacter;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CharacterRepository extends CrudRepository<GameCharacter, Long> {

    @Query("SELECT c from GameCharacter c where c.name = ?1")
    List<GameCharacter> findByName(String name);


}
