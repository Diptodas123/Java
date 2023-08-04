class Employee1
{
    int id;
    int salary;
    String name;
    Employee1()
    {
        id=0;
        name="Your name";
        salary=0;
    }
    Employee1(String n)
    {
        name=n;
    }
    Employee1(int s)
    {
        salary=s;
    }
    Employee1(int i,String n,int s)
    {
        id=i;
        name=n;
        salary=s;
    }
}
class _02_ConstuctorOverloading {
    public static void main(String[] args) {
        Employee1 emp=new Employee1(10000);
        System.out.println(emp.id+" "+emp.name+" "+emp.salary);
    }
}
