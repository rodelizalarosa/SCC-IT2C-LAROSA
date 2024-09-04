package javarode;

public class Products {

       int id, sold, stock;
       String name;
       double price;
       
       public void addProduct(int pid, String pname, int psold, int pstock, double pprice){
            
           this.id = pid;
           this.name = pname;
           this.sold = psold;
           this.stock = pstock;
           this.price = pprice;
       }
       
       public void viewProduct(){
           
           double profit = this.sold * this.price;
           String status = (this.sold < 1) ? "Out-of-Stock" : "Available";
           double tep = this.stock * this.price;
           
           System.out.println("\n");      
           System.out.printf("%-10d %-10s %-10d %-10d %-10.2f %-10.2f %-12s %-10.2f\n",
                           this.id, this.name, this.sold, this.stock, this.price, profit, status, tep);
       }
}
