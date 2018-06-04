package com.training.java;

class Box {
	int height;
	int width;
	int depth;
	
	public double cube(int v, int w){
		this.height=v;
		this.width=v;
		this.depth=v;
		return (this.height*this.depth*this.width);
	}
	
	public double volume(int h, int w, int d){
		this.height=h;
		this.width=w;
		this.depth=d;
		return h*w*d;
		
	}
	
}


