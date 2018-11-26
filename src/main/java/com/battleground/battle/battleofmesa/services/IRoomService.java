package com.battleground.battle.battleofmesa.services;

import com.battleground.battle.battleofmesa.entity.Room;

public interface IRoomService {

    public Room createRoom(Room room);
    public Room getRoomById(Long id);
    public Room getRoomByName(String roomName);
    public Iterable<Room> getRooms();

}
