package javarode;

import java.util.Scanner;

public class Salary {
    
    public static void salaries(){
        
        Salaries[] slr = new Salaries[100];
        Scanner sc = new Scanner(System.in);
        
        String name;
        int nums, sid, i;
        int rate, hrs, deduc;
        double sReq = 0, tDeduc = 0;
  
        
        System.out.print("\nEnter the no. of Employees: ");
        nums = sc.nextInt();
        
        for (i = 0; i < nums; i++){
        
            System.out.println("\nDetails of EMP "+(i+1)+":");

            
            System.out.print("\tID: ");
            sid = sc.nextInt();

            System.out.print("\tName: ");
            name = sc.next();

            System.out.print("\tRate (Hour): ");
            rate = sc.nextInt();

            System.out.print("\tHours Worked: ");
            hrs = sc.nextInt();

            System.out.print("\tTotal Deduction: ");
            deduc = sc.nextInt();

           
            slr[i] = new Salaries();
            slr[i].addSalary(sid, name, rate, hrs, deduc);
            
            sReq += (rate * hrs);
            tDeduc += (deduc);
        }
        
        System.out.println("\n");
        System.out.printf("%-8s  %-10s  %-10s  %-10s  %-10s  %-12s  %-10s\n", "ID", "Name", "Rate", "Hours", "Gross", "Deductions", "Net Pay");

        
        for (i = 0; i < nums; i++){
            
            slr[i].viewSalary();        
        }
        
        System.out.printf("\nTotal Salary for Request: %.2f ", sReq);
        System.out.printf("\nTotal Deductions: %.2f ", tDeduc);
        System.out.printf("\nTotal Salary to Release: %.2f ", (sReq - tDeduc));
    }
}
