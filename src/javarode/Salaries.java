
package javarode;


public class Salaries {
    
    int id;
    String name;
    int r, hrs, deduc;
    double gross, netP;
    double sReq, tDeduc, sRel;
    
    public void addSalary (int sid, String name, int rate, int hours, int deduction) {
    
        this.id = sid;
        this.name = name;
        this.r = rate;
        this.hrs = hours;
        this.deduc = deduction;
    
    }
    
    public void viewSalary (){
        
        this.gross = (float)r*hrs;
        this.netP = gross - deduc;
        
        this.sReq += this.gross;
        this.tDeduc += this.deduc;
        this.sRel += this.netP;
       
    
        System.out.printf("%-7s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s \n", "ID", "Name", "Rate", "Hours", "Gross", "Deductions", "Net Pay" );
        System.out.printf("%-10d %-10s %-10d %-10d %-10.2f %-10d %-10.2f", this.id, this.name, this.r, this.hrs, gross, this.deduc, netP );
        
        System.out.printf("Total Salary for Request: ", sReq);
        System.out.printf("Total Deductions: ", tDeduc);
        System.out.printf("Total Salary to Release: ", sRel);
        
        
        
    }
}
