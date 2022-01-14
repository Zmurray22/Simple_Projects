/*
Program Name: HealthProfiler
Programmer's Name: Zach Murray 
Program Description: User data class for health report 
 */
package com.healthprofiler;

public class HealthProfile {

    String name;
    int age, height;
    double weight;
    
    public HealthProfile(String name, int age, double weight, int feet, int inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        setHeight(feet, inches);
    }
    
    public HealthProfile(){
        this.name = "";
        this.age = 0;
        this.weight = 0;
        setHeight(1, 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int feet, int inches) {
        this.height = (feet * 12) + inches;
    }
    
    public void setWeight(double weight){
        this.weight = weight;
    }
    
    //behaviors
    public double getBMI(){
        return (weight * 703) / (height * height);
    }
    
    public String getCategory(){
        double bmi = getBMI();
        if(bmi < 18.5)
            return "Underweight";
        else if(bmi < 25)
            return "Normal";
        else if(bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }
    
    public int getMHR(){
        return 220 - age;
    }
}
