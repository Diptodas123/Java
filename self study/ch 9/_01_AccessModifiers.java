
class Employee {
    private int id;
    private String name;

    String getName() {
        return name;
    }

    int getId() {
        return id;
    }

    void setName(String n) {
        this.name = n;
    }

    void setId(int i) {
        this.id = i;
    }
}

public class _01_AccessModifiers {
    public static void main(String[] args) {
        Employee obj = new Employee();
        // obj.id=121; ->will throw an error as id has private access modifier(it can
        // only be accessed through methods)
        obj.setId(4);
        obj.setName("Dipto");
        System.out.println(obj.getId());
        System.out.println(obj.getName());
    }
}
