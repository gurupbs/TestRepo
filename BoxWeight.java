package com.training.java;

public class BoxWeight extends Box{
	   int weight;
	   
	   public void BoxWeight(){
		    super.depth=0;
			super.height=0;
			super.width=0;
		}	  		   
	
	public void BoxWeight(int h, int wd, int d , int w){
		super.depth=d;
		super.height=h;
		super.width=wd;
		this.weight=w;
			
	}
	
	public double weight(int h, int wd, int d , int w){
		return w;
	}
	

}
