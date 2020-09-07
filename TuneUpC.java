import java.util.Scanner;

   class TuneUpC{
      public static void main(String[] args){

       Scanner input = new Scanner(System.in);
       double rate = 0.00, charge, hours = 0.00;   
     
       System.out.println("car(C or c) - PHP20.00 per hr"+
	                     "\nbus(B or b) - PHP35.00 per hr"+
	                     "\ntruck(T or t)- PHP50.00 per hr ");
       
       System.out.println("Enter Vehicle Type: ");
       char vehicle = input.next().charAt(0);//Prompt User to input vehice type
    
         try{
            System.out.println("Enter Hours Spent (Must be a Number): ");  
            hours = input.nextDouble();
         }catch(Exception er){return;}//In case user inputs anything else aside from a number
       
       
       //Identifying Vehicle type from Input
         switch(vehicle)
        {
            case 'c':                
            case 'C':
                rate = 20.00;
                break;
            case 'b':
            case 'B':
                rate = 35.00;
                break;
            case 't':
            case 'T':
                rate = 50.00;
                break;
            default:
               System.out.println("Invalid Vehicle Type!"); 
         }    
       
       //Calculation  
        charge = rate * hours;
       //Output
        System.out.println("Total parking charge: PHP"+charge);
      }
   }