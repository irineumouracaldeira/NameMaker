


import java.util.Scanner;
public class NameMaker {

   
    
public static void main(String args[])
{
    String firstName,middleName,lastName = null, fullName;
    
    try (Scanner scanner = new Scanner (System.in)) {
         System.out.println("Insira seu primeiro nome: ");
         firstName = scanner.nextLine();
         
         System.out.println("Insira seu  primeiro nome: ");
         middleName = scanner.nextLine();
         
         fullName = " " + firstName + " " + middleName + " " + lastName;
         
         System.out.println("Nome completo: " + fullName);
    }
    }
       
        
        
    }
    

