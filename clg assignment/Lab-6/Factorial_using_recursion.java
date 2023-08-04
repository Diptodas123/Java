class Factorial
{
    int fact(int num)
    {
        int result;
        if(num==1 || num==0)
        {
            return 1;
        }
        else
        {
            result= num*fact(num-1);
            return result;
        }
    }
}
class Factorial_using_recursion {
    public static void main(String[] args) {
        Factorial obj=new Factorial();
        System.out.println("Factorial of 3 is: "+obj.fact(3));
        System.out.println("Factorial of 5 is: "+obj.fact(5));
    }
}
