public class Array4 {
    public static void main(String[] args) {
        /*Create array*/
        String[] copyFrom = {"Affogato","Americano","Corretto","Cortado","Doppio","Espresso","Frappucino","Freddo","Lungo","Macchiato","Marocchino","Ristretto"};
        
        String[] copyTo = new String[7];
        System.arraycopy(copyFrom,2, copyTo, 0, 7);
    
        /*Initialize array*/
        for (String coffee : copyTo) {
            System.out.println(coffee + " ");
        }
    }
}