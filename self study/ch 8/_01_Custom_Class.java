class Employee
{
    int id;
    String name;
    int salary;
    void getDetails()
    {
        System.out.println("Id:- "+id);
        System.out.println("Name:- "+name);
    }
    int getSalary()
    {
        return salary;
    }
}
public class _01_Custom_Class {
    public static void main(String args[])
    {
        Employee dipto=new Employee();
        Employee harry=new Employee();
        dipto.id=64;
        dipto.name="Dipto Das";
        dipto.salary=35;

        harry.id=12;
        harry.name="Harry";
        harry.salary=75;
        // System.out.println(dipto.id);
        // System.out.println(dipto.name);

        int salary=dipto.salary;
        //printing the Attributes of Dipto
        dipto.getDetails();
        System.out.println("Salary of Dipto: "+salary+"k\n");

        //printing the Attributes of Harry
        salary=harry.salary;
        harry.getDetails();
        System.out.println("Salary of Harry: "+salary+"k");
    }
}
