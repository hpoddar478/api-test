package com.day1;

public class Example {

    public static void main(String[] args) {

        //Practicing Parameterised constructor

/*        Student obj1 = new Student("Harshit","Male",75,85);

        System.out.println(obj1.getPercentage()+"%");

        Student obj2 = new Student("Abhishek","Male",75,65);

        System.out.println(obj2.getPercentage()+"%");

        System.out.println(obj1.equals(obj2));*/


       // Practising static variable

/*        Student obj1 = new Student();
        obj1.name = "Harshit";
        obj1.gender = "Female";
        obj1.math_marks = 85 ;
        obj1.physics_marks = 65 ;

        System.out.println("Percentage of object 1 before overriding -"+obj1.getPercentage());

        Student obj2 = new Student("Abhishek","Male",85,95);
        System.out.println("Percentage of object 2 before overriding -"+obj2.getPercentage());

        Student.totalMarks = 300;

        System.out.println("Percentage of object 1 after overriding -"+obj1.getPercentage());
        System.out.println("Percentage of object 2 after overriding -"+obj2.getPercentage());*/

        //Getters and setters

        Student obj1 = new Student();
        obj1.setName("Abhishek");
        obj1.setGender("Male");
        obj1.setMath_marks(78);
        obj1.setPhysics_marks(97);
        obj1.setIs_veg(false);

        System.out.println("Maths marks of obj1 : "+obj1.getMath_marks());



    }
}
