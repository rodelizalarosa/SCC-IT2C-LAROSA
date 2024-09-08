
package javarode;


public class Salaries {
    
    int id;
    String name;
    int r, hrs, deduc;
    double gross, netP, sRel = 0;
    
    public void addSalary (int sid, String name, int rate, int hours, int deduction) {
    
        this.id = sid;
        this.name = name;
        this.r = rate;
        this.hrs = hours;
        this.deduc = deduction;
        
        this.gross = r*hrs;
        this.netP = ((r * hrs) - deduc);
    
    }
    
    public void viewSalary (){
             
        System.out.printf("%-8d  %-10s  %-10d  %-10d  %-10.2f  %-12d  %-10.2f\n", this.id, this.name, this.r, this.hrs, gross, this.deduc, netP);
   
        
    }
}
