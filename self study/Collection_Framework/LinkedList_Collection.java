import java.util.LinkedList;
public class LinkedList_Collection {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        
        l2.add(0, 55);
        l2.add(1, 65);
        l2.add(2, 75);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.addAll(l2);
        int length=l1.size();
        for(int i=0;i<length;i++)
        {
            System.out.println(l1.get(i));  //get() method is used to access the elements
        }
        //other methods which is not there in ArrayList
        l1.addFirst(1);
        l1.addLast(10);
    }
}
