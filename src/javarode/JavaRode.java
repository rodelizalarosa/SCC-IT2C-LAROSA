package javarode;

import java.util.Scanner;

public class JavaRode {

    
    public static void main(String[] args) {
       
        
        Scanner sc = new Scanner(System.in);
        String ch;
        
       // do {
        
        System.out.println("\n--------------------");
        System.out.println("        MENU        ");
        System.out.println("--------------------");
        
        System.out.println("\n 1. Grade \n 2. Net Pay \n 3. Salaries \n 4. Products \n 5. Accounts");
        System.out.print("\nEnter action: ");
        int action = sc.nextInt();
        
               
        while (action > 5){
            System.out.print("\tInvalid action. Try again: ");
            action = sc.nextInt();
        }
        
        switch (action){
            case 1: 
                scGrades grd = new scGrades();
                grd.genGrade();
                break;
            case 2:
                netPayAct npa = new netPayAct();
                npa.getPay();
                break;
            case 3:
                Salary sal = new Salary();
                sal.salaries(); 
                break;
            case 4: 
                Product pr = new Product();
                pr.inputProduct();
                break;
            case 5:
                Account ac = new Account();
                ac.inputAccount();
                break;
        }
//                System.out.print("\n\nDo you want to use other system? (Y/N): ");
//                ch=sc.next();
//                
//                if(ch.equals("N") || ch.equals("n")){
//                    System.out.println("\f");
//                }
         
//        } while(ch.equals("Y") || ch.equals("y"));
//            
//            System.out.println("\nThank you for using JavaRode!");


//           
//                
                
//        }
    //       netPayAct npa = new netPayAct();
    //       npa.getPay();
        
    //       Grades gr = new Grades();
    //       gr.addGrades (11001, "Rodeliza", 1.0, 1.0, 1.0, 1.0);
    //       gr.viewGrades();
    //        
    //       Grades gr1 = new Grades();
    //       gr.addGrades (11001, "Myca", 1.0, 1.0, 1.0, 1.0);
    //       gr.viewGrades();
    
//           Products pr = new Products();
//           pr.addProduct (10011, "Soap", 30, 30, 20.00 );
//           pr.viewProduct();
//           
//           Products pr1 = new Products();
//           pr.addProduct (10011, "Cards", 0, 60, 50.00 );
//           pr.viewProduct();

//          scGrades grd = new scGrades();
//          grd.genGrade();

//            Salary sal = new Salary();
//            sal.salaries(); 

            
    }
}
