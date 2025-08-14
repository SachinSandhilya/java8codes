package session5;

interface InterfA
{
	default void m1()
	{
		System.out.println("interface InterfA's m1 method");
	}
	
}

interface InterfB
{
	default void m1()
	{
		System.out.println("interface InterfB's m1 method");
	}
}


class Test5 implements InterfA, InterfB
{
									/*Way 01 :- */
	//defining own m1 method
	public void m1()
	{
		System.out.println("Implementation class has own m1 method");
	}
	
	
									//*Way 02 :- *//
	//overriding the methods from interfaces
//	@Override
//	public void m1()
//	{
//		InterfA.super.m1();
//		InterfB.super.m1();
//	}
//	
	public static void main(String[] args) 
	{
		Test5 test5 = new Test5();
		test5.m1();
	}
}

