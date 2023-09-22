package com.mypracticeofcorejava.generics;



public class Demo3<T> {
	
	T var;
	
	void add(T var) {
		this.var=var;
	}
	
	T get() {
		return var;
	}
	
	public static void main(String[] args) {
		Demo3<Integer> d1=new Demo3<>();
		d1.add(10);
		System.out.println(d1.get());
		
		Demo3<String> d2=new Demo3<>();
		d2.add("Hello");
		System.out.println(d2.get());
	}
}
