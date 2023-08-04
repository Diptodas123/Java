public class _06_pr04 {
    public static void main(String[] args) 
    {
        String str = "My name is   IoT";

        //double space
        if (str.indexOf("  ") == -1)    // -->as if no space then it returns -1
        {
            System.out.println("There is no double space");
        } 
        else 
        {
            System.out.println("There is double space");
        }

        //tripple space 
        if (str.indexOf("   ") == -1) 
        {
            System.out.println("There is no tripple space");
        }
        else 
        {
            System.out.println("There is tripple space");
        }
    }
}
