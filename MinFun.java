package com.training.java;

public class MinFun {

	public static int minFunction(int x, int y){
		return (x<y)?x:y;
	/*	if (x <y){
			//System.out.println("X is minimun");
			return x;
		}
		else{
			//System.out.println("y is minimun");
			return y;
		}*/
		
	}
	
     public static double minFunction(double x, double y){
    	 if (x <y){
 			//System.out.println("X is minimun");
 			return x;
 		}
 		else{
 			//System.out.println("y is minimun");
 			return y;
 		}
 		
 	}
	public static void main(String[] args) {
	      int a = 11;
	      int b = 6;
	      double c = 7.3;
	      double d = 9.4;
	      
	      int result1 = minFunction(a, b);  
	      double result2 = minFunction(c, d);        // same function name with different parameters.
	      
	      System.out.println("Minimum Value = " + result1);
	      System.out.println("Minimum Value = " + result2);
	   }
}