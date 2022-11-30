package com.acc.accessmodifiers;//default with in class

public class Default {
	 int i=10;
	 void show() {
		System.out.println("Hello World");
	}
	public static void main(String[] args) {
		Default d1=new Default();
		d1.show();
		System.out.println(d1.i);
	}

}
