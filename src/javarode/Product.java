
package javarode;

import java.util.Scanner;

public class Product {
    
    public static void inputProduct(){
        
        Products[] prod = new Products[100];
        Scanner yay = new Scanner(System.in);
        
        int num;
        double profit = 0, tep = 0;
        
        System.out.print("\nEnter no. of Products: ");
        num = yay.nextInt();
        
        for (int i = 0; i < num; i++ ){
            
            System.out.print("\nEnter details for product " + (i+1) + " ");
            
            System.out.print("\n");
            System.out.print("\tEnter Product ID: ");
            int id = yay.nextInt();
            
            System.out.print("\tEnter Product Name: ");
            String name = yay.next();
            
            System.out.print("\tEnter Product Price: ");
            double price = yay.nextDouble();
            
            System.out.print("\tEnter Product Sold: ");
            int sold = yay.nextInt();
            
            System.out.print("\tEnter Product Stock: ");
            int stock = yay.nextInt();
            
            prod[i] = new Products();
            prod[i].addProduct(id, name, sold, stock, price);
            
            profit += (price*sold);
            tep += (price*stock);
            
            
        }
        
        System.out.println("\n");
        System.out.printf("%-10s %-15s %-10s %-10s %-10s %-10s %-15s %-10s\n",
                            "ID", "NAME", "PRICE", "SOLD", "STOCK", "PROFIT", "STATUS", "Total Expense Profit");
        
        
        for (int i=0; i<num; i++){
            prod[i].viewProduct();
        }
        
    }
}
