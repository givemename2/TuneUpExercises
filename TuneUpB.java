import java.util.Scanner;
class TuneUpB{
   public static void main(String[] args){
    
    char num = '0';
    Scanner input = new Scanner(System.in);
    boolean flag = true;//Checks if the input is valid otherwise it will run the loop again
       
       do{
       System.out.println("Enter An Integer: ");
       
       num = input.next().charAt(0); //Prompt user for input

       
         switch(num)//Identifying day of the week from user Input
        {
            case '0':
                System.out.println("Sunday");
                flag = false;
                break;
            case '1':
                System.out.println("Monday");
                flag = false;
                break;
            case '2':
                System.out.println("Tuesday");
                flag = false;
                break;
            case '3':
                System.out.println("Wednesday");
                flag = false;
                break;
            case '4':
                System.out.println("Thursday");
                flag = false;
                break;
            case '5':
                System.out.println("Friday");
                flag = false;
                break;
            case '6':
                System.out.println("Saturday");
                flag = false;
                break;
            default:
               if (Character.isLetter(num)){
                      System.out.println("Error! please input an integer!");
                      
                  }
               else{
                      System.out.println("Invalid input. Please enter a value from 0-6");
                  }       
         }
      }while(flag);      
   }
}