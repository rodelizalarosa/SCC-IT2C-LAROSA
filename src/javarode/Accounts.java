
package javarode;

public class Accounts {
    
    int id;
    String fName, lName, email, username, password;
    
    public void addAccount(int aId, String fname, String lname, String em, String user, String pass){
        
        this.id = aId;
        this.fName = fname;
        this.email = em;
        this.username = user;
        this.password = pass;
        
    }
    
    public void viewAccount(){
        
        System.out.println("");
    }
}
