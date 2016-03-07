package multiThreading;

import java.util.Scanner;

public class Count {
	count(){
		System.out.println("enter the inputs");
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(n);
	}
	
	public static void main(String args[]){
		Count cnt = new Count();
		
		
	}
}