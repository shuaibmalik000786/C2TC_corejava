package com.acc.constructors;
class Employee1 {
	int id;
	String name;
	float salary;
	Employee1(int id, String name, float salary) {
		System.out.println("User defined no argument" + "Constructor executed");
	}
	void display() {
		System.out.println(id +" "+ name +" "+ salary);
	}
}
public class Main1 {

	public static void main(String[] args) {
		Employee1 e1=new Employee1(1,"shuaib",30000);
	    Employee1 e2=new Employee1(2,"malik",40000);
	    Employee1 e3=new Employee1(3,"mohammed",50000);
	    e1.display();
	    e2.display();
	    e3.display();

	}

}
