package com.acc.constructors;
class Employee {
	int id;
	String name;
	float salary;
	Employee() {
		System.out.println("User defined no argument" + "Constructor executed");
	}
	void display() {
		System.out.println(id +" "+ name +" "+ salary);
	}
}
public class Main {

	public static void main(String[] args) {
    Employee e1=new Employee();
    Employee e2=new Employee();
    e1.display();
    e2.display();

    }

}
