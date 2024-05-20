
package com.mycompany.herencias;

public class Person {
private String name;    
private String Id;    
private int age;

public Person(String name, String Id, int age) {
        this.name = name;
        this.Id = Id;
        this.age = age; 
    }

public void fingerPrintRegister(){
    System.out.println("Registro la huella dactilar");
 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
    
}
