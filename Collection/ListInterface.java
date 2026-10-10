import java.util.*;
class ListInterface{
    public static void main(String [] args){
        List<Integer> list1=new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        System.out.println(list1);
        System.out.println("Using get Function");
        //Use get Function
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(3));
        System.out.println(list1.get(list1.size()-1));

        System.out.println("Using set Function");
        //Using set Function
        list1.set(0,100);
        list1.set(1,200);
        list1.set(2,300);
        list1.set(list1.size()-1,400);
        
        System.out.println(list1+" ");

        // toArray
        Object[] arr=list1.toArray();
        for(Object obj:arr){
            System.out.print(obj+" ");
        }
        System.out.println();
        System.out.println(list1.contains(100));
        System.out.println(list1.contains(200));
        System.out.println(list1.contains(250));




    }
}