package com.acc.accessmodifiers;//protected within class

public class Protected {
	protected int i=10;
	protected void show() {
		System.out.println("Hello World");
	}
	public static void main(String[] args) {
    Protected p1=new Protected();
    p1.show();
    System.out.println(p1.i);
	}

}
