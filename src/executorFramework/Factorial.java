package executorFramework;

public class Factorial 
{
    public static void main(String[] args) 
    {   
        //for-loop to find the factorial of first 10 natural numbers  
        long startTime=System.currentTimeMillis();
        for(int j=1; j<=10; j++)  
        {
            System.out.println(new Factorial().factorial(j));
        } 
        long endTime= System.currentTimeMillis();
        System.out.println("Total-time => "+(endTime-startTime));
    }


    //method to find the factorial !!
    public int factorial(int j)
    {
        int fact=1;
        for(int i=j; i>=1; i--)
        {
            fact=fact*i;
        }
        return fact;
    }
}
