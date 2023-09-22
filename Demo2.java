package com.mypracticeofcorejava.generics;

public class Demo2<T> {
	T var;
	public static void main(String[] args) {
		Demo2 d=new Demo2();
		d.var="hello";
		System.out.println("Variable is : "+d.var);
		d.var=10;
		System.out.println("Variable is : "+d.var);
		d.var=true;
		System.out.println("Variable is : "+d.var);
		d.var=2.5;
		System.out.println("Variable is : "+d.var);
	}
}
