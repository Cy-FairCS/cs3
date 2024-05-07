//© A+ Computer Science
// www.apluscompsci.com

//insertion sort example

import static java.lang.System.*;
import java.util.*;

public class InsertionSortManualShift
{
	public static void insertionSort( Comparable[] ray)
	{
	   for(int i=1; i<ray.length; ++i)
	   {
           //out.println("i = "+i+"\tray["+i+"] = "+ray[i]);       
	      Comparable val = ray[i];
	      int j=i;
	      while(j>0 && val.compareTo(ray[j-1])<0)
	      {         
	         ray[j]=ray[j-1];
	         j--;
	      }
	      ray[j]=val;
           //out.println("ray = "+Arrays.toString(ray)+"\n");         
 	   }
	}	
}