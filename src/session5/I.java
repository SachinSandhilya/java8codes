package session5;

public interface I 
{
    public void m1();
    public void m2();
    public default void m3()
    {
        System.out.println("Default-method in interface");
    }
}

class Test1 implements I 
{
    public void m1(){}
    public void m2() {}
}

class Test2 implements I 
{
    public void m1(){}
    public void m2() {}
}

class Test100 implements I 
{
    public void m1(){}
    public void m2() {}
}