package javarode;
import java.util.Scanner;



public class JavaRode {

    
    public static void main(String[] args) {
       
//       netPayAct npa = new netPayAct();
//       npa.getPay();
        
//        Grades gr = new Grades();
//        gr.addGrades (11001, "Rodeliza", 1.0, 1.0, 1.0, 1.0);
//        gr.viewGrades();
//        
//        Grades gr1 = new Grades();
//        gr.addGrades (11001, "Myca", 1.0, 1.0, 1.0, 1.0);
//        gr.viewGrades();
    
           Products pr = new Products();
           pr.addProduct (10011, "Soap", 30, 30, 20.00 );
           pr.viewProduct();
           
           Products pr1 = new Products();
           pr.addProduct (10011, "Cards", 0, 60, 50.00 );
           pr.viewProduct();
           
    }
}
