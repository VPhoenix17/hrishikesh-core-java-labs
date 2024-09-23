package com.deloitte.lab09.ex04;

import java.util.function.BiFunction;

public class Ex04 {
	public static void main(String[] args) {
		
		BiFunction<String, Integer, Person> personCreate = Person::new;
		
		Person person = personCreate.apply("JohnDoe", 23);
		
		System.out.println(person);
	}
}

class Person {
    private String name;
    private int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

   
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}