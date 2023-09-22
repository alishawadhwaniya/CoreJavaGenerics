package com.mypracticeofcorejava.generics;

public class Demo4<T1,T2> {
	T1 var1;
	T2 var2;
	
	Demo4(T1 var1,T2 var2){
		this.var1=var1;
		this.var2=var2;
	}
	
	public void print() {
		System.out.println(var1+","+var2);
	}
	
	public static void main(String[] args) {
		Demo4<String,Boolean> d1=new Demo4<>("Ram",true);
		d1.print();
		Demo4<String,Integer> d2=new Demo4<>("Shyam",10);
		d2.print();
		Demo4<Integer,Long> d3=new Demo4<>(10,580675024l);
		d3.print();
	}

}
