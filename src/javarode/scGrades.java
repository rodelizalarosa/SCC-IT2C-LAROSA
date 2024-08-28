
package javarode;

import java.util.Scanner;

public class scGrades {
    
     public static void genGrade() {
        
        Scanner sc = new Scanner(System.in);
        Grades[] gr = new Grades[100];
        
        String name;
        int nums, sid, i;
        double p, m, pf, f;
  
        
        System.out.print("Enter no. of Students: ");
        nums = sc.nextInt();
        
        for (i = 0; i < nums; i++){
        
            System.out.println("\nEnter details of student "+(i+1)+":");

            
            System.out.print("\tID: ");
            sid = sc.nextInt();

            System.out.print("\tName: ");
            name = sc.next();

            System.out.print("\tPrelims: ");
            p = sc.nextDouble();

            System.out.print("\tMidterms: ");
            m = sc.nextDouble();

            System.out.print("\tPrefinal: ");
            pf = sc.nextDouble();

            System.out.print("\tFinals: ");
            f = sc.nextDouble();
            
            gr[i] = new Grades();
            gr[i].addGrades(sid, name, p, m, pf, f);
        }
        
        for (i = 0; i < nums; i++){
            
            gr[i].viewGrades();
        
        
        }
    }
}
