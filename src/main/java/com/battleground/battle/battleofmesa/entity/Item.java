package com.battleground.battle.battleofmesa.entity;

import javax.persistence.*;


@Entity(name="ITEM")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="ITEM_ID")
    private Long id;


    @Column(name="ITEM_NAME")
    private String itemName;

    public Item(){}
    public Item(String itemName)
    {
        this.itemName = itemName;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
