package javarode;

import java.util.Scanner;

public class Salary {
    
    public static void salaries(){
        
        Salaries[] slr = new Salaries[100];
        Scanner sc = new Scanner(System.in);
        
        String name;
        int nums, sid, i;
        int rate, hrs, deduc;
        double p, m, pf, f;
  
        
        System.out.print("Enter the no. of Employees: ");
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
        }
        
        for (i = 0; i < nums; i++){
            
            slr[i].viewSalary();
        
        
        }
    }
}