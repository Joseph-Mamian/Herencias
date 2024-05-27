package com.mycompany.game;

import com.mycompany.game.Ships.StellarDestroyer;
import com.mycompany.game.Ships.MillenariumFalcon;

public class Game {

    public static void main(String[] args) {
        StellarDestroyer Destructor_Estelar = new StellarDestroyer(true, 20, true, "Pancho", true, 200,100,1000,200);
        
        Destructor_Estelar.shoot();
           
        MillenariumFalcon Halcon_milenario = new MillenariumFalcon (true, 20, true, "Han", true, 200,100,1000,200);
        
        Halcon_milenario.shoot();
    }
}
