package com.acc.accessmodifiers;

public class Public {
public int i=20;
public void show() {
	System.out.println("ACHARYA");
}
	public static void main(String[] args) {
    Public P1=new Public();
    P1.show();
    System.out.println(P1.i);
    }

}
