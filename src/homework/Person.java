package homework;

import java.util.Random;

public class Person {
     private String name;
     private String surName;
     protected int id;
     protected double salary;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {this.salary = salary;}

    public void createId(){
        Random random=new Random();
        this.id=random.nextInt(100)+1;
    }

    public void over(){
        System.out.println("person class çalışıyor");
    }

}
