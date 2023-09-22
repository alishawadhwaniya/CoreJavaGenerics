package com.mypracticeofcorejava.generics;

public class InnerClasses {
	
	void m1() {
		Inner i=new Inner();
		i.innerMethod();
	}
	
	public static void main(String[] args) {
		InnerClasses ic=new InnerClasses();
		ic.m1();
	}
	
	private class Inner{
		void innerMethod() {
			System.out.println("Inner method called");
		}
	}
}
