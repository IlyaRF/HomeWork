package ru.GB.Gaitanov.I.firstquarter.HomeWork5;

public class Employee {

    private String nameSurnamePatronymic;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    public Employee(String nameSurnamePatronymic, String position, String email, int age) {
        this(nameSurnamePatronymic, position, "email", 0, age);
    }
    public Employee(String nameSurnamePatronymic, String position, int phoneNumber, int age) {
        this(nameSurnamePatronymic, position, phoneNumber, 0, age);
    }

    public Employee(String nameSurnamePatronymic, String position, int phoneNumber, int salary, int age) {
        this(nameSurnamePatronymic, position, "email", phoneNumber, salary);
    }

    public Employee(String nameSurnamePatronymic, String position, String email, int phoneNumber, int salary) {
        this(nameSurnamePatronymic, position, email, phoneNumber, salary, 0);
    }

    public Employee(String nameSurnamePatronymic, String position, String email, int phoneNumber, int salary, int age) {
        this.nameSurnamePatronymic = nameSurnamePatronymic;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        setAge(age);
    }

    public String getNameSurnamePatronymic() {
        return nameSurnamePatronymic;
    }

    public void setNameSurnamePatronymic(String nameSurnamePatronymic) {
        this.nameSurnamePatronymic = nameSurnamePatronymic;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age < 250)
            this.age = age;
        else
        System.out.println("Некорректный возраст");
    }
}


