package com.mycompany.herencias;

public class Student extends Person{
   private String carrer;
   private int semester;
   private float average;

    public Student(String carrer, int semester, float average, String name, String Id, int age) {
        super(name, Id, age);
        this.carrer = carrer;
        this.semester = semester;
        this.average = average;
    }
   
    public void seeGrades(){
        System.out.println("Viendo lista de notas del estudiante");
    }
    
    public void registerSubjetcs(){
        System.out.println("Registrar materias del estudiante");
    }
    
    public void cancelSubjects(){
        System.out.println("Cancelar materias del estudiante");
    }

    public String getCarrer() {
        return carrer;
    }

    public int getSemester() {
        return semester;
    }

    public float getAverage() {
        return average;
    }
    
    
      
}
