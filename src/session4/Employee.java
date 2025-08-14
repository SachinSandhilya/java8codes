package session4;

public class Employee 
{
    String name;
    Integer eno;

    Employee(String name,Integer eno)
    {
        this.name=name;
        this.eno=eno;
    }

    @Override
    public String toString()
    {
        return name+":"+eno;
    }
}
