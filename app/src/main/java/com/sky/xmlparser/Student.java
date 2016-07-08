package com.sky.xmlparser;

public class Student {
    private String number;
    private String name;
    private int age;
    private String sex;
    private double score;

    public Student() {
        // TODO Auto-generated constructor stub
    }

    public Student(String number, String name, int age, String sex, double score) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.score = score;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // 复写toString方法；
    public String toString() {
        return "Student number=" + number + "name = " + name + "age = " + age + "sex = " + sex + "score = " + score;

    }
}
