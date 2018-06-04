package com.training.java;

public class MyCalss {
		/**
	 * This program shows a msg.
	 * 
	 * @version 2.3
	 * @author AA
	 */

		public static void main(String[] args) {
			String msg = "Using Core Java!";
			System.out.println(msg);
			
			for (int i = 0; i < msg.length(); i++)
				System.out.print("=");
			
			System.out.println();
		}
	}