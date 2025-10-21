import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        // TODO: Ask the user how many items they are purchasing
        Scanner scan = new Scanner(System.in);
        System.out.print("How many items are you purchasing: ");
        int items = scan.nextInt();
        double price = 0;
        // TODO: Use a for loop to read each item's price (double)
        for(int i=1;i<items+1;i++){
            System.out.print("Enter price for item " + i + "? ");
            price += scan.nextDouble();
        }
        // TODO: Accumulate the total cost
        // TODO: Print the final summary line with item count and total
        // TODO: Use Scanner for input
        System.out.println("Your cart has " + items + "items with a total cost of " + price);
    }
}
