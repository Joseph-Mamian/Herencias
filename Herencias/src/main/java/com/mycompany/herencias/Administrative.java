package com.mycompany.herencias;

public class Administrative extends Person {
    private String dependency;

    public Administrative(String dependency, String name, String Id, int age) {
        super(name, Id, age);
        this.dependency = dependency;
    }

    public String getDependency() {
        return dependency;
    }
    
   
    public void SeeData(){
        System.out.println("mostrar datos al administrativo");
    }
    
    @Override
    public void fingerPrintRegister(){
        System.out.println("Adimistrativo registando huella");
    }
    
}
