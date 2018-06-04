package com.training.java;

public class CmdLine {

	public static void main(String[] args) {
		if (args[0].equals("-h"))
			System.out.print("help options....,");
		else if (args[0].equals("-g"))
			System.out.print("Goodbye,");
		
		// print the other command-line arguments
		for (int i = 1; i < args.length; i++)
			System.out.print(" " + args[i]);
		
		System.out.println("....\n");
	}

}