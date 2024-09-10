package javarode;

public class Grades {
    
    int id;
    String name;
    double pr, m, p, f;
    
    public void addGrades (int sid, String name, double prlm, double mt, double pf, double fnl) {
    
        this.id = sid;
        this.name = name;
        this.pr = prlm;
        this.m = mt;
        this.p = pf;
        this.f = fnl;
    
    }
    
    public void viewGrades (){
        
        double avg = (this.pr + this.m + this.p + this.f) / 4;
        String remarks = (avg < 3.0) ? "Passed" : "Failed";
        
        
        
        System.out.printf("%-10d %-15s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n",
                           this.id, this.name, this.pr, this.m, this.p, this.f, avg, remarks );
        
        
    }
    
}


