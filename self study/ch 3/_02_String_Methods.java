

public class _02_String_Methods
{
    public static void main(String[] args) 
    {
        String str="Dipto";

        //var.lenght()
        int lenght=str.length();
        System.out.println("Lenght of str: "+lenght);

        //var.toLowerCase()
        String lCase=str.toLowerCase();
        System.out.println("After converting into lowecase: "+lCase);

        //var.toUpperCase()
        String uCase=str.toUpperCase();
        System.out.println("After converting into uppercase: "+uCase);

        //var.trim()
        String unTrimmed="              Dipto                  ";
        System.out.println("Untrimmed one: "+unTrimmed);
        String trimmed=unTrimmed.trim();
        System.out.println("Trimmed one: "+trimmed);

        //var.substring()
        System.out.println(str.substring(2,4));    //-->includes the beginIndex but excludes the endIndex

        //var.replace()
        System.out.println(str.replace("Di","Pi"));

        //var.startsWith()
        System.out.println(str.startsWith("Di"));

        //var.endsWith()
        System.out.println(str.endsWith("to"));

        //var.charAt()
        System.out.println(str.charAt(1));

        //var.indexOf()
        System.out.println(str.indexOf("Di"));      // --> if a whole string is given as an argument then only the first index will be returned

        //var.indexOf("String",staring index)
        System.out.println(str.indexOf("ip",2));    //returns the index passed as argument from the starting index given as another argument
        //returns -1 if that char is not present from the given index

        //var.lastIndexOf()
        System.out.println(str.lastIndexOf("ip",2));    // -->starts searching from back as given in the argument 
        
        //var.equals()
        System.out.println(str.equals("dipto"));    // --> returns boolean value[case sensitive], compares between the String and the given argument(object) 
        
        //var.equalsIgnoreCase()
        System.out.println(str.equalsIgnoreCase("dipto"));  // -->returns boolean value[igoners case]

        //var.split()
        String demo="Decode With Dipto";
        String[] demoArr=demo.split(" ");
        for(String word: demoArr)
        {
            System.out.println(word);
        }
    }
}
