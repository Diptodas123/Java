class Employee
{
    int salary;
    String name;
    void setSalary(int s)
    {
        salary=s;
    }
    int getSalary()
    {
        return salary;
    }
    void setName(String n)
    {
        name=n;
    } 
    String getName()
    {
        return name;
    }
}
public class _02_pr01 {
    public static void main(String[] args) {
        Employee obj1= new Employee();
        obj1.setName("Dipto");
        obj1.setSalary(35);
        System.out.println(obj1.getName()); 
        System.out.println(obj1.getSalary()); 
        
    }
}
