package com.battleground.battle.battleofmesa.entity;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.io.InputStream;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@Entity
@Table(name="CHARACTERS")
public class GameCharacter {

    @Transient
    private int min = 8;

    @Transient
    private int max = 18;
  //  Logger logger = LoggerFactory.getLogger(GameCharacter.class);

   @Id
   @GeneratedValue(strategy= GenerationType.SEQUENCE)
   @Column(name="CHARACTER_ID")
   private Long id;

   @Column(name="CHARACTER_NAME")
   private String name;

   @Column(name="CHARACTER_CLASS")
   private String characterClass;

   @Column(name="INT_VALUE")
   private int intValue;

   @Column(name="WIS")
   private int wis;

   @Column(name="CHA")
   private int cha;

   @Column(name="STR")
   private int str;

   @Column(name="DEX")
   private int dex;

   @Column(name="CON")
   private int con;

   @Column(name="LOCATION")
   private int location;

   @Column(name="INVENTORY")
   private Item[] inventory;

   @Column(name="HIT_POINTS")
   private int hitPoints;

   @Transient
   public String errorMessage;

   public GameCharacter(){}
   public GameCharacter(String name, String characterClass, int intValue, int str, int wis,int cha, int dex,int con, int location)
   {
      this.name=name;
      this.characterClass=characterClass;
      setIntValue(intValue);
      setStr(str);
      setWis(wis);
      setCha(cha);
      setDex(dex);
      setCon(con);
      setHitPoints(getCon()*2);
      setLocation(location);
   }
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

  
   public int getIntValue() {
      return intValue;
   }

  
   public void setIntValue(int intValue) {
      this.intValue = intValue;
   }

  
   public int getWis() {
      return wis;
   }

  
   public void setWis(int wis) {

      this.wis = wis;

   }

  
   public int getCha() {
      return cha;
   }

  
   public void setCha(int cha) {

      this.cha = cha;

   }

  
   public int getStr() {
      return str;
   }

  
   public void setStr(int str) {

      this.str = str;
   }

  
   public int getDex() {
      return dex;
   }

  
   public void setDex(int dex) {

      this.dex = dex;
   }

  
   public int getCon() {
      return con;
   }

  
   public void setCon(int con) {
      this.con = con;
   }

  
   public int getLocation() {
      return location;
   }

  
   public void setLocation(int location) {

      this.location = location;

   }

  
   public Item[] getInventory() {
      return inventory;
   }

  
   public void setInventory(Item[] inventory) {

      this.inventory = inventory;
   }

  
   public int getHitPoints() {
      return hitPoints;
   }

  
   public void setHitPoints(int hitPoints) {
      this.hitPoints = hitPoints;
   }

   public int generateRandomNumber(int min, int max)
   {
      return new Random().nextInt((max - min) + 1) + min;
   }

   public IntStream generateRandomSequence(int min, int max)
   {
     // logger.debug("generaRandomSequence "+ min+"  "+max);
      Random random = new Random();
       return  random.ints(11,min,(max+1));
   }
}
