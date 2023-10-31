package com.example.builderpattern;

public interface PersonBuilder {
    PersonBuilder withFirstName(String firstName);
    PersonBuilder withLastName(String lastName);
    PersonBuilder withAge(int age);
    PersonBuilder withAddress(String address);
    PersonBuilder withPhone(String phone);
    Person build();
}
