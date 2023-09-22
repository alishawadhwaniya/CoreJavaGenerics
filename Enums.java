package com.mypracticeofcorejava.generics;

public class Enums {
	enum Weekdays{
		Monday,Tuesday,Wednesday,Thursday,Friday
	}
	
	enum Weekends{
		Saturday,Sunday
	}
	
	public static void main(String[] args) {
		Courses[] courses = Courses.values();
		for(Courses c:courses) {
			System.out.println(c);
		}
		Courses java = Courses.Java;
		System.out.println(java);
		
	}
}
