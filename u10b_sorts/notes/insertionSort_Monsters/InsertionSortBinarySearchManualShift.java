//© A+ Computer Science
// www.apluscompsci.com

//insertion sort example

import static java.lang.System.*;

public class InsertionSortBinarySearchManualShift
{
   public static void insertionSort( Comparable[] ray)
   {
   	  //This loop starts by adding the second entry to the sorted part of the array
   	  //Then it Inserts it in the appropriate spot in the array by finding that
   	  //spot using binary search, storing entry that is to be inserted in a temporary
   	  //variable, then shifting every entry to the right that needs to be moved, 
   	  //and then inserting the value by copying it from the temporary variable into 
   	  //its proper location.
      for (int i=1; i< ray.length; ++i){
      	 //this is the binary search
         int bot=0, top=i-1;
            //out.println("i = "+i+"\tray["+i+"] = "+ray[i]);
            //out.println("before while loop, bottom = "+bot+"\ttop = "+top);       
         while (bot<=top){
            int mid=(bot+top)/2;
            if (ray[mid].compareTo(ray[i])<0)
               bot=mid+1;
            else top=mid-1;
         }
           //out.println("after while loop, bottom = "+bot+"\ttop = "+top);
         
         //store the value temporarily
         Comparable temp = ray[i];
         //shift values over
         for (int j=i; j>bot; --j)
            ray[j]=ray[j-1];
         //insert the value
         ray[bot]=temp;
            //out.println("ray = "+Arrays.toString(ray)+"\n");
      }
   }
}
