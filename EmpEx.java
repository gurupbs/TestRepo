package com.training.java;

import java.time.LocalDate;
import java.util.Random;

public class EmpEx {
	public static void main(String[] args)
	   {
	      // fill the staff array with three Employee4 objects
	      Employee4[] staff = new Employee4[3];

	      staff[0] = new Employee4("Ajay", 40000);
	      staff[1] = new Employee4("Vijay", 60000);
	      staff[2] = new Employee4("Rahul", 65000);

	      // print out information about all Employee4 objects
	      for (Employee4 e : staff)
	      {
	         e.setId();
	         System.out.println("name = " + e.getName() + ", id = " 
	                   + e.getId() + ", salary = "
	               + e.getSalary());
	      }

	      int n = Employee4.getNextId(); // calls static method
	      System.out.println("Next available id=" + n);
	   }
	}
class Employee4
{
   private String name;
   private double salary;
   private LocalDate hireDay;
   private static int id=1;
   private static int identity;

   public Employee4(String n, double s, int year, int month, int day)
   {
      name = n;
      salary = s;
      hireDay = LocalDate.of(year, month, day);
   }

   public Employee4(String n, double s)
   {
      name = n;
      salary =s;
      
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

   public void setId(){
	   this.identity=id++; 
	   
	   
   }
   
   public static int getId(){
	   return identity;
   }
   
   public static int getNextId(){
	   return id;
   }
   public void raiseSalary(double byPercent)
   {
      double raise = salary * byPercent / 100;
      salary += raise;
   }
}