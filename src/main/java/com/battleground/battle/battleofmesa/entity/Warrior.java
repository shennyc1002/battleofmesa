package com.battleground.battle.battleofmesa.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Warrior extends GameCharacter {

    Logger logger = LoggerFactory.getLogger(Warrior.class);

    public Warrior(String name, String characterClass)
    {
       this.name=name;
       this.characterClass=characterClass;
       setIntValue(generateRandomSequence(min,max).min().getAsInt());
       setStr(generateRandomSequence(min,max).max().getAsInt());
       setWis(generateRandomNumber(min,max));
       setCha(generateRandomNumber(min,max));
       setDex(generateRandomNumber(min,max));
       setCon(generateRandomNumber(min,max));
       setHitPoints(getCon()*2);
       setLocation(1);
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getCharacterClass() {
        return super.getCharacterClass();
    }

    @Override
    public void setCharacterClass(String characterClass) {
        super.setCharacterClass(characterClass);
    }

    @Override
    public int getIntValue() {
        return intValue;
    }

    @Override
    public void setIntValue(int intValue) {
        logger.debug("inside int value "+intValue);
        this.intValue = intValue;
    }

    @Override
    public int getWis() {
        return wis;
    }

    @Override
    public void setWis(int wis) {

        this.wis = wis;

    }

    @Override
    public int getCha() {
        return cha;
    }

    @Override
    public void setCha(int cha) {

        this.cha = cha;

    }

    @Override
    public int getStr() {
        return str;
    }

    @Override
    public void setStr(int str) {

        this.str = str;
    }

    @Override
    public int getDex() {
        return dex;
    }

    @Override
    public void setDex(int dex) {

        this.dex = dex;
    }

    @Override
    public int getCon() {
        return con;
    }

    @Override
    public void setCon(int con) {
        this.con = con;
    }

    @Override
    public int getLocation() {
        return location;
    }

    @Override
    public void setLocation(int location) {

        this.location = location;

    }

    @Override
    public List<Item> getInventory() {
        return inventory;
    }

    @Override
    public void setInventory(List<Item> inventory) {

        this.inventory = inventory;
    }

    @Override
    public int getHitPoints() {
        return hitPoints;
    }

    @Override
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}
