package com.training.java;

public class Const {
			public static void main(String args[]) {
		    Student st1 = new Student();
		    Student st2 = new Student(15);
		    System.out.println(st1.age + "  " +  st2.age);
		}

	}


	class Student {
		   int age ;
		   
		   Student() {
		      this(20);
		   }
		   
		   Student(int age) {
		      this.age = age;	
		   }
	}