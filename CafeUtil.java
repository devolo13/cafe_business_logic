import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {
    public int getStreakGoal(int numWeeks){
        int drinks = 0;
        for (int i = 0; i < numWeeks; i++){
            drinks = drinks + drinks + 1;
        }
        return drinks;
    }

    public double getOrderTotal(double[] prices){
        double total = 0;
        for (double price : prices){
            total += price;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for (String item : menuItems){
            System.out.println(item);
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        // String userName = System.console().readline();
        String userName = System.console().readLine();
        // String userName = "steven";
        System.out.println("Hello, " + userName);
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(userName);
        System.out.println(customers);
    }
}

