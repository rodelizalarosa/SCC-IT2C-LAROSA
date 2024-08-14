
package javarode;

import java.util.Scanner;

public class netPayAct {
    
    public void getPay() {
        
        Scanner input = new Scanner (System.in); 
        
        String name; 
        int age, rate, hrs, deduc;
        float gross,netP;
        
        System.out.print("Enter your name: ");
        name = input.nextLine();
        
        System.out.print("Enter Age: ");
        age = input.nextInt();
        
        System.out.print("Enter Rate per Hour: ");
        rate = input.nextInt();
        
        System.out.print("Enter total hours worked: ");
        hrs = input.nextInt();
        
        System.out.print("Enter total deductions: ");
        deduc = input.nextInt();
        
        gross = (float)rate*hrs;
        netP = gross - deduc;
        
        
        System.out.println("\n----------------------------------");
        System.out.println("          SLIP DETAILS            ");
        System.out.println("----------------------------------");
        
        System.out.println("Date: August 14, 2024");
        System.out.println ("Name: " + name);
        System.out.println("Age: " + age);
        
        System.out.printf("Total Gross: %.2f", gross);
        System.out.println("\nTotal Deduction: " + deduc );
        
        System.out.println("\n----------------------------------");
        System.out.printf("Net Pay: %.2f",  netP);
        System.out.println("\n----------------------------------");
    }
}
