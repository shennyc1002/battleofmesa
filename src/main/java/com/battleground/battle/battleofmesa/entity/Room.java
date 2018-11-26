package com.battleground.battle.battleofmesa.entity;

import javax.persistence.*;

@Entity
@Table(name="ROOM")
public class Room {

    @Id
    @Column(name="ROOM_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="ROOM_NAME")
    private String roomName;

    @Column(name="ROOM_DESCRIPTION")
    private String roomDescription;

    @Column(name="EXITS")
    private String exits;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public String getExits() {
        return exits;
    }

    public void setExits(String exits) {
        this.exits = exits;
    }
}
