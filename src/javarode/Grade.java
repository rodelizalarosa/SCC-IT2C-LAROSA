
package javarode;

import java.util.Scanner;

public class scGrades {
    
     public void editGrades(Grades[] grs, int size, int id){
         
         Scanner sc = new Scanner(System.in);
         
         for(int i=0; i < size; i++ ){
              if (grs[i].id == id) { 
               
                 System.out.print("\tNew prelim grade: ");
                 double prelim = sc.nextFloat();
                 grs[i].pr = prelim;
                 
                 System.out.print("\tNew midterm grade: ");
                 double midterm = sc.nextFloat();
                 grs[i].m = midterm;
                 
                 System.out.print("\tNew prefinal grade: ");
                 double prefi = sc.nextFloat();
                 grs[i].p = prefi;
                 
                 System.out.print("\tNew finals grade: ");
                 double finals = sc.nextFloat();
                 grs[i].f = finals;
                 
                 System.out.println("\n\tGrades updated successfully!");
                 return;
             }   
         }
         
            System.out.println("Student not found! ");
     }
    
     public void genGrade() {
        
        Scanner sc = new Scanner(System.in);
        Grades[] gr = new Grades[100];
        
        String name, op;
        int nums=0, sid, i;
        double p, m, pf, f;
   
  
        do{
  
         System.out.println("\n");
         System.out.println("Welcome to the Grading App!");
         System.out.println("-------------------------------------");
         System.out.println("1. ADD");
         System.out.println("2. VIEW");
         System.out.println("3. UPDATE");
         System.out.println("4. DELETE");
         System.out.println("5. EXIT");
         System.out.println("-------------------------------------");
         
         
         System.out.print("Enter option: ");
         int option = sc.nextInt();
         
         while (option > 5){
             System.out.print("Invalid option, try again:  ");
             option = sc.nextInt();
         }
    
        
        switch (option){
            case 1:
                System.out.print("\nEnter no. of Students: ");
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
                System.out.println("\nStudent details added successfully!");
            
            break;
            
            case 2:
                
                System.out.print("\n");
                System.out.printf("%-10s %-15s %-10s %-10s %-10s %-10s %-10s %-10s\n", "ID", "NAME", "PRELIM", "MIDTERM", "PREFINAL", "FINALS", "AVERAGE", "REMARKS");
                for (i = 0; i < nums; i++){
            
                gr[i].viewGrades();
                }
            break;
               
            case 3:
                System.out.print("\nEnter ID to Update: ");
                int ids = sc.nextInt();     
                editGrades(gr, nums, ids);    
                break;
        }
         
            System.out.print("\nDo you want to continue?(Y/N): ");
            op = sc.next();
         
        } while(op.equals("Y") || op.equals("y"));
   
    
    }
}

