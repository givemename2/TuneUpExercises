import java.util.Scanner;

   class TuneUpA{ 
      public static void main(String[] args){
       
        Scanner input = new Scanner(System.in);
        
         
        int temp, n = 1;
        int[] num = new int[3];
       
        for(int i = 0; i < num.length; i++){//Loops 3 times for user input
            System.out.println("Enter Number "+ n);
            num[i] = input.nextInt();         
            n++;
        }
         temp = num[0];
         
        for(int j = 0; j < num.length; j++){//Checks which number is the smallest by looping through all the arrays
            if(num[j]<temp){
                temp = num[j];
            }
        }
        
        System.out.println("Output: "+temp);//Output
      }
   }