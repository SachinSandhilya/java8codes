package session4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingListOfEmployee 
{
    public static void main(String[] args) 
    {
        
        List<Employee>employees=new ArrayList<Employee>();
        employees.add(new Employee("Sachin", 205));
        employees.add(new Employee("Prashant", 202));
        employees.add(new Employee("Swarup", 203));
        employees.add(new Employee("Ayush", 201));
        employees.add(new Employee("Nikhil", 204));

        System.out.println(employees);
        //Sorting the arrayList Of Employees by their employee Number i.e eNo
        Comparator<Employee> comp = (e1, e2) ->(e1.eno>e2.eno)?1:(e1.eno<e2.eno)?-1:0; 
           
        Collections.sort(employees, comp);
        System.out.println(employees);

        //Sorting the arrayList of Employees by their employeeName
        Comparator<Employee> comp1=(e1,e2) ->e1.name.compareTo(e2.name);
        Collections.sort(employees, comp1);
        System.out.println(employees);
    }
}

