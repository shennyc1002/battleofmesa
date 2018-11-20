package com.battleground.battle.battleofmesa.entity;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.io.InputStream;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;


public abstract class GameCharacter {

    @Transient
    protected int min = 8;

    @Transient
    protected int max = 18;
    Logger logger = LoggerFactory.getLogger(GameCharacter.class);

   @Id
   @GeneratedValue(strategy= GenerationType.SEQUENCE)
   @Column(name="CHARACTER_ID")
   protected Long id;

   @Column(name="CHARACTER_NAME")
   protected String name;

   @Column(name="CHARACTER_CLASS")
   protected String characterClass;

   @Column(name="INT_VALUE")
   protected int intValue;

   @Column(name="WIS")
   protected int wis;

   @Column(name="CHA")
   protected int cha;

   @Column(name="STR")
   protected int str;

   @Column(name="DEX")
   protected int dex;

   @Column(name="CON")
   protected int con;

   @Column(name="LOCATION")
   protected int location;

   @Column(name="INVENTORY")
   protected List<Item> inventory;

   @Column(name="HIT_POINTS")
   protected int hitPoints;

   @Transient
   public String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getCharacterClass() {
      return characterClass;
   }

   public void setCharacterClass(String characterClass) {
      this.characterClass = characterClass;
   }

   public abstract int getIntValue() ;

   public abstract void setIntValue(int intValue);

   public abstract int getWis();

   public abstract void setWis(int wis);

   public abstract int getCha() ;

   public abstract void setCha(int cha) ;

   public abstract int getStr();

   public abstract void setStr(int str);

   public abstract int getDex() ;

   public abstract void setDex(int dex) ;

   public abstract int getCon() ;

   public abstract void setCon(int con) ;

   public abstract int getLocation() ;

   public abstract void setLocation(int location) ;

   public abstract List<Item> getInventory() ;

   public abstract void setInventory(List<Item> inventory) ;

   public abstract int getHitPoints() ;

   public abstract void setHitPoints(int hitPoints) ;

   public int generateRandomNumber(int min, int max)
   {
      return new Random().nextInt((max - min) + 1) + min;
   }

   public IntStream generateRandomSequence(int min, int max)
   {
      logger.debug("generaRandomSequence "+ min+"  "+max);
      Random random = new Random();
       return  random.ints(11,min,(max+1));
   }
}
