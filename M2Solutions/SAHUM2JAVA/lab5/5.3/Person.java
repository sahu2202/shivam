package com.cg.lab4;

public class Person {
	String name;
	float age;

	public Person() {
		super();
		this.name = null;
		this.age = 0.0f;
	}
	public Person(String name, Float age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getAge() {
		return age;
	}
	public void setAge(Float age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
