package com.example.builderpattern;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phone;

    public Person(String firstName, String lastName, int age, String address, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person {\n\t" +
                "firstName: " + firstName + ",\n\t" +
                "lastName: " + lastName + ",\n\t" +
                "age: " + age + ",\n\t" +
                "address: " + address + ",\n\t" +
                "phone: " + phone + "\n" +
                "}";
    }
}
