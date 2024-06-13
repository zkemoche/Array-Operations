
import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("First element: "+ arrayList.get(0));

        System.out.println("Elements in ArrayList: ");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        arrayList.set(1, "Blueberry");

        arrayList.remove(2);

        
        System.out.println("Final List: " + arrayList);
        
        System.out.println("Length of arrayList  : " +arrayList.size() + " elements");
        
    }
}
