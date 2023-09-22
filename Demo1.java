package com.mypracticeofcorejava.generics;

public class Demo1<T> {
	
	public void m1(T param) {
		System.out.println("Param received: "+param);
	}
	
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.m1(10);
		d.m1("Hello");
		d.m1(100.54);
		d.m1(true);
	}
}
