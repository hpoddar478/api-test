 package com.day1;

import java.util.Objects;

public class Student {

    private String name;
    private String gender;
    private int math_marks;
    private int physics_marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMath_marks(int math_marks) {
        this.math_marks = math_marks;
    }

    public void setPhysics_marks(int physics_marks) {
        this.physics_marks = physics_marks;
    }

    public void setIs_veg(boolean is_veg) {
        this.is_veg = is_veg;
    }

    public static void setTotalMarks(int totalMarks) {
        Student.totalMarks = totalMarks;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getMath_marks() {
        return math_marks;
    }

    public int getPhysics_marks() {
        return physics_marks;
    }

    public boolean isIs_veg() {
        return is_veg;
    }

    public static int getTotalMarks() {
        return totalMarks;
    }

    private boolean is_veg;

    static int totalMarks = 200;

    public Student() {
    }

    /**
     * @param name          name of student
     * @param gender        Male/female
     * @param math_marks    maths marks obtained
     * @param physics_marks physics marks obtained
     * @author harshit
     */
    public Student(String name, String gender, int math_marks, int physics_marks) {
        this.name = name;
        this.gender = gender;
        this.math_marks = math_marks;
        this.physics_marks = physics_marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return math_marks == student.math_marks && physics_marks == student.physics_marks && is_veg == student.is_veg && Objects.equals(name, student.name) && Objects.equals(gender, student.gender);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", math_marks=" + math_marks +
                  ", physics_marks=" + physics_marks +
                ", is_veg=" + is_veg +
                '}';
    }

    /**
     *
     * @return Percentage of student marks
     */
    public double getPercentage() {

        int marksObtained = math_marks + physics_marks;

        return (marksObtained*100 / totalMarks);
    }


}
