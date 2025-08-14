package session5;

public interface Interf 
{
    default void m1()
    {
        System.out.println("default-method");
    }

    // default int hashCode()
    // {
    //     return 10;
    // }
}

class Test implements Interf
{

}