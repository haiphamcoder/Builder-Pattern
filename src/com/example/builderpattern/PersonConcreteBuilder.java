package com.example.builderpattern;

public class PersonConcreteBuilder implements PersonBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phone;

    @Override
    public PersonBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public PersonBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public PersonBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public PersonBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public PersonBuilder withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public Person build() {
        return new Person(firstName, lastName, age, address, phone);
    }
}
