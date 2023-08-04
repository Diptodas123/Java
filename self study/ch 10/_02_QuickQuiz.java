class Animal
{
    String name;
    void setName(String n)
    {
        name=n;
    }
    String getName()
    {
        return name;
    }
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Barking....");
    }
}
public class _02_QuickQuiz {
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.setName("Dog");
        System.out.print("Name of the animal: "+obj.getName()+"\nSound: ");
        obj.sound();
    }
}
