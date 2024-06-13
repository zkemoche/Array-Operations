
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();

        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Frog");

        System.out.println("First element: "+ linkedList.get(0));

        System.out.println("Elements in linkedList: ");
        for (String animal : linkedList) {
            System.out.println(animal);
        }

        linkedList.set(1, "Eagle");

        linkedList.remove(2);

        
        System.out.println("Final linkedList: " + linkedList);
        
        System.out.println("Length of linkedList  : " +linkedList.size() + " elements");
        
    }
}
