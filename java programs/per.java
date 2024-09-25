import javax.sql.rowset.spi.SyncResolver;

import java.util.*;
public class per {
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
            System.out.println("ENTER MARKS OF EACH SUBJECT:");
            System.out.println("ENGLISH MARKS=");

            int a= sc.nextInt();
            System.out.println("CHEMISTRY MARKS=");
            int b= sc.nextInt();
            System.out.println("PHYSICS MARKS=");
            int c=sc.nextInt();
            System.out.println("MATHS MARKS=");
            int d=sc.nextInt();
            System.out.println("COMPUTER MARKS=");
            int e=sc.nextInt();
            int total =a+b+c+d+e;
            double PER= (double)total/5;
            System.out.println("TOTAL MARKS:"+total);
            System.out.println("PERCENTAGE OF MARKS:"+PER+"%");
            System.out.println("STATUS OF YOUR PERFORMANCE");
            if(PER>=90){
                System.out.println("A+ and PASS");
            }if(PER>=80 && PER<90){
                System.out.println("A and PASS");
            }if(PER>=70 && PER<80){
                System.out.println("B and PASS");
            }if(PER>=60 && PER<70){
                System.out.println("C and PASS");
            }if(PER<60){
                System.out.println("PAPU FAIL HO GAYA");
            }
            System.out.println("THANK YOU");
            
        
            
            
        
    }
    
}
