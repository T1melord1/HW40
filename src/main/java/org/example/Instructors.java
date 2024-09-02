package org.example;

public class Instructors {
    private String name;
    private int age;
    private int id;
    private int salary;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Instructors(String name, int age, int id, int salary) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Instructors{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
