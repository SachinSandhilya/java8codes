package session5;

import java.util.Scanner;

interface Interff
{
	public static int sum(int a, int b)
	{
		return a+b;
	}
}
class Test6
{
	public static void main(String[] args) 
	{
		int x=10, y=20;
	
		System.out.println("The sum is "+Interff.sum(x, y));
		
	}
}
