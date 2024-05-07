//© A+ Computer Science
// www.apluscompsci.com

//insertion sort example

import static java.lang.System.*;

public class InsertionSortBinarySearchArrayCopy
{
   public static void insertionSort( int[] ray)
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
         while (bot<=top){
            int mid=(bot+top)/2;
            if (ray[mid]<ray[i])
               bot=mid+1;
            else top=mid-1;
         }
         //store the value temporarily
         int temp = ray[i];
         //shift values over
         System.arraycopy(ray,bot,ray,bot+1,i-bot);
         //insert the value
         ray[bot]=temp;
      }
   }
}
