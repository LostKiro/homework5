package ru.geekbrains;

public class Employee {
    public static void main(String[] args) {

    }
    private final String name;
    private final String position;
    private final String email;
    private final int phoneNumber;
    private final int theSalary;    // зарплата
    private final int age;

    public int getAge() {
        return age;
    }

    public Employee(String name, String position, String email,
                    int phoneNumber, int theSalary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.theSalary = theSalary;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", theSalary=" + theSalary +
                ", age=" + age +
                '}';
    }
}

