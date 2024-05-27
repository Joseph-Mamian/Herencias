package com.mycompany.game.Ships;

public class StellarDestroyer extends NuclearShip {
    private boolean hyperSpeed;
    private int cannons;
    private boolean shields;

    public StellarDestroyer(boolean hyperSpeed, int cannons, boolean shields, String name, boolean armory, int crewmates, int damage, int health, int speed) {
        super(name, armory, crewmates, damage, health, speed);
        this.hyperSpeed = hyperSpeed;
        this.cannons = cannons;
        this.shields = shields;
    }
    
    @Override
    public void shoot(){
        super.shoot();
        System.out.println("Dipsaro de rasho laser!!!!!!!!");
    }
    
    
}
