import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {

    // public static void getOrderTotal(int[] lineItems) {
    // int[] lineItems = {3, 1, 3, 1, 2};
    // double arr[] = new double[] {12,34,45,21,33,4};
    // double sum = 0;
    // for (int i = 0; i < arr.length; i++) {
    // sum+=arr[i];
    // }
    // System.out.println("Array Sum = "+sum);
    // return sum;
    // }

    // private static String;

    public int getStreakGoal(int numWeeks) {
        // int arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;

    }

    public static double getOrderTotal(double[] prices) {
        
        double suma = 0;
        for (int a = 0; a < prices.length; a++) {
            suma += prices [a];

        }
        return suma;
    }

    
    public static void displayMenu(ArrayList<String> menu){

        for(int i = 0; i<menu.size(); i++){
            System.out.println(menu.get(i));
        }
}

    public void addCustomer(ArrayList<String> customers){
        System.out.println("ingresa nombre:" );
        String userName = System.console().readLine();
        System.out.println("hola "+userName);
        int numeroClientes = customers.size();
        System.out.println("hay: "+numeroClientes +" clientes antes que: "+userName);
        customers.add(userName);

        System.out.println(customers.toString());

        // for(int i=0; i<customers.size(); i++){
        //     System.out.println(customers.get(i));
        // }
    }

}