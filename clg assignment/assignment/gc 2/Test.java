class Address
{
    String country;
    String state;
    String streetName;
    int pincode;
    Address(String country,String state,String streetName,int pincode)
    {
        this.country=country;
        this.state=state;
        this.streetName=streetName;
        this.pincode=pincode;
    }
    void getAdd()
    {
        System.out.println("Address: "+streetName+", "+pincode+", "+state+", "+country);
    }
}
class Student
{
    String name;
    int rollno;
    Address adr;
    Student( String name, int rollno, Address adr)
    {
        this.name=name;
        this.rollno=rollno;
        this.adr=adr;
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Rollno.: "+rollno);

        //can also be written as-> System.out.println("Address: "+adr.streetName+", "+adr.pincode+", "+adr.state+", "+adr.country);
        adr.getAdd();
    }
}
class Test
{
    public static void main(String[] args) {
        Address adr1=new Address("India", "West Bengal", "First Street", 700001); 
        Student std=new Student("Dipto Das", 21, adr1);
        std.display();
    }
}