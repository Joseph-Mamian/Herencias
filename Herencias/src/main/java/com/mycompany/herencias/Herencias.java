package com.mycompany.herencias;

public class Herencias {

    public static void main(String[] args) {
        Person persona1 = new Person("Juan", "12833", 23);
        System.out.println("La persona");
        persona1.fingerPrintRegister();
          
        System.out.println("Hola tu nombre es " + persona1.getName());
        
        
        Administrative administrativo = new Administrative("Jefe", "Pepe", "24143" , 27);
        System.out.println("Hola, lo hemos identificado como " + administrativo.getDependency());
        administrativo.fingerPrintRegister();
       
        Student estudiante = new Student ("comunicacion social", 3 , 3.1f , "Pepito", "142334", 24);
        System.out.println("Hola, lo hemos identificado como un estudiante de " + estudiante.getCarrer() + " de nombre " + estudiante.getName() + " y codigo " + estudiante.getId());
    }
}
