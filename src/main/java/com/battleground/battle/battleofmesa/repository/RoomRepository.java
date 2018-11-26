package com.battleground.battle.battleofmesa.repository;

import com.battleground.battle.battleofmesa.entity.Room;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoomRepository extends CrudRepository<Room, Long> {

    @Query("SELECT r from Room r where r.roomName=?1")
    Optional<Room> getRoomByName(String name);
}
