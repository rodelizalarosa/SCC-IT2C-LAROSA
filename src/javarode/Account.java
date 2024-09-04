package javarode;

import java.util.Scanner;

public class Account {
    
    public static void inputAccount(){
    
        Scanner sc = new Scanner (System.in);
        Accounts[] acc = new Accounts [50];
        
        int num, id;
        
        System.out.println("Enter number of Accounts: ");
        num = sc.nextInt();
        
        for (int i = 0; i < num; i++){
            System.out.println("Enter detail of Account " + (i+1) + " ");
            
            System.out.printf("\nID: ");
            id = sc.nextInt();
            
            
        }
        
        
}
}
