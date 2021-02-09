
package gradecalculator;

import java.util.Scanner;


public class Main {
    
      public double calAvg (double [] array)
        {
           double total=0;
           int i ;
           for(i = 0; i < array.length; i++)
           {
               if(array[i] > 0)
                    total += array[i];
               else
                   System.out.println("\n"+array[i]+ " is negleted, as it is negative ");
           }
           return (total / i);
        }
    
     public double calMax(double [] array)
     {
         double max = 0;
         for(int i = 0; i < array.length; i++)
         {
             if (array[i] > max)
                 max = array[i];
             else
                 continue;   
         }
         return max;
                  
     }

    public static void main(String[] args) {
        
        
        Main one  = new Main();
        double [] grades = new double [10];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < grades.length ; i++)
        {
            System.out.println("Enter Student's Grade[" + i +"]: ");
            grades[i] = sc.nextDouble();
        }
         System.out.print("Total entered grades are: ");
        for(int i = 0; i < grades.length ; i++)
        {
            System.out.print(grades[i]+"   ");
              
        }
        
        System.out.println("\nAvregae of student's grades is: " +one.calAvg(grades));
        System.out.println("\nMaximum grade that student has Achieved is: " +one.calMax(grades));
          
    }
    
}
