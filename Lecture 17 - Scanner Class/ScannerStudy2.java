
import java.util.*;

public class ScannerStudy2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstname = sc.nextLine();
        System.out.println("Please enter your last name: ");
        String lastname = sc.nextLine();
        System.out.println("Please enter your profession: ");      
        String profession = sc.nextLine();
        System.out.println("Please enter your profession: ");     
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


