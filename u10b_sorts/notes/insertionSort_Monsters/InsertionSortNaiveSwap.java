//insertion sort example

import static java.lang.System.*;
import java.util.*;

public class InsertionSortNaiveSwap
{
	public static void insertionSort( Comparable[] ray)
	{
	   for(int i=1; i< ray.length; ++i)
	   {
           //out.println("i = "+i+"\tray["+i+"] = "+ray[i]);       
	      Comparable val = ray[i];
	      int j=i;
	      while(j>0 && val.compareTo(ray[j-1])<0)
	      {  Comparable temp=ray[j];       
	         ray[j]=ray[j-1];
	         ray[j-1]=temp;
	         j--;
	      }
           //out.println("ray = "+Arrays.toString(ray)+"\n");         
 	   }
	}	
}