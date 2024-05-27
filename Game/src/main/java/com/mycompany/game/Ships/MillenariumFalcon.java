package com.mycompany.game.Ships;

public class MillenariumFalcon extends NuclearShip {
    private boolean hyperSpeed;
    private int cannons;
    private boolean shields;

    public MillenariumFalcon(boolean hyperSpeed, int cannons, boolean shields, String name, boolean armory, int crewmates, int damage, int health, int speed) {
        super(name, armory, crewmates, damage, health, speed);
        this.hyperSpeed = hyperSpeed;
        this.cannons = cannons;
        this.shields = shields;
    }
    
    @Override
    public void shoot(){
        System.out.println("Disparo a cañonazos");
    }
    
    public void toggleShiel(){
      this.shields=! this.shields;
    }
}
