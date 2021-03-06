package com.training.java;
import java.time.LocalDate;

public class Employee {


			public static void main(String[] args)
		   {
		      // fill the staff array with three Employee objects
			MyEmployee[] staff = new MyEmployee[3];

		      staff[0] = new MyEmployee("Ajay Kumar", 75000, 1987, 12, 15);
		      staff[1] = new MyEmployee("Vijay H", 50000, 1999, 10, 1);
		      staff[2] = new MyEmployee("Ravi L", 40000, 1990, 3, 15);
		     
		      

		      // raise everyone's salary by 5%
		      for (MyEmployee e : staff)
		         e.raiseSalary(5);

		      // print out information about all Employee objects
		      for (MyEmployee e : staff)
		         System.out.println("name = " + e.getName() + ", salary = " 
		                   + e.getSalary() + ", hireDay = "
		               + e.getHireDay());
		   }
		}

		class MyEmployee
		{
		   private String name;
		   private double salary;
		   private LocalDate hireDay;

		   public MyEmployee(String n, double s, int year, int month, int day)
		   {
		      name = n;
		      salary = s;
		      hireDay = LocalDate.of(year, month, day);
		   }

		   public String getName()
		   {
		      return name;
		   }

		   public double getSalary()
		   {
		      return salary;
		   }

		   public LocalDate getHireDay()
		   {
		      return hireDay;
		   }

		   public void raiseSalary(double byPercent)
		   {
		      double raise = salary * byPercent / 100;
		      salary += raise;
		   }
		}