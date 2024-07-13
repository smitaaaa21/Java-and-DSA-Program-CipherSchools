import java.util.*;

public class ScannerStudy
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String firstname = sc.next();
        String lastname = sc.next();
        System.out.println("Please enter your profession: ");      
        String profession = sc.next();
        System.out.println("Please enter your profession: "); 
        sc.nextLine();     
        String address = sc.nextLine();
        System.out.println("Please enter your number: ");
        int number = sc.nextInt(); 

        


        System.out.println("First Name: "+firstname);  
        System.out.println("Last Name: "+lastname);  
        System.out.println("Profession: "+profession); 
        System.out.println("Address: "+address); 
        System.out.println("Number: "+number); 
        sc.close();
         
    }
}

