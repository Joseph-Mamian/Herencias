package com.mycompany.game.Ships;

public class NuclearShip {
  private String name;
  private boolean armory;
  private int crewmates;
  private int damage;
  private int health;
  private int speed;

    public NuclearShip(String name, boolean armory, int crewmates, int damage, int health, int speed) {
        this.name = name;
        this.armory = armory;
        this.crewmates = crewmates;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
    }
  
  final public void fly(){
      System.out.println("A volar!!!!!!!!!!!");
  }
  
  public void shoot(){
      System.out.println("A disparar!!!!!!!!");
  }
  
}
