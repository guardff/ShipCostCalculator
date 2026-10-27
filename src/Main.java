import java.util.Scanner; // Step 1: Import the Scanner class

class Main {
    public static void main(String[] args) {
        double ItemPrice ;
        double ShippingCost ;
        double TotalPrice;

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter item price:");

        ItemPrice = scanner.nextDouble();
        if (ItemPrice>=100)
        {
            ShippingCost = 0 ;
        }
        else{
            ShippingCost = 0.02 * ItemPrice;

        }
        TotalPrice= ItemPrice+ShippingCost;
        System.out.println("The shipping cost is "+ ShippingCost + "$");
        System.out.println("The Total Price is " + TotalPrice + "$");


    }
}