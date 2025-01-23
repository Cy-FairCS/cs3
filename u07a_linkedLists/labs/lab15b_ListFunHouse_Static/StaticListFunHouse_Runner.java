//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
import java.util.*;
import static java.lang.System.*;

public class StaticListFunHouse_Runner
{
   public static void main ( String[] args )
   {
      //ListNode z = null;
      
      ListNode z = new ListNode("go",
                   new ListNode("on",
                   new ListNode("at",
                   new ListNode("34",
                   new ListNode("2.1",
                   new ListNode("-a-2-1",
                   new ListNode("up",                  
                   new ListNode("over",null))))))));
                  
      out.println("Lab15b Test Code\n\n");   
      
      out.print("                Original list values:  "); 
      StaticListFunHouse.print(z);
      out.println();
      
      out.println("                                       num nodes = " + StaticListFunHouse.nodeCount(z));

      out.print("             After calling nodeCount(z):  "); 
      StaticListFunHouse.print(z);
      out.println();    

      StaticListFunHouse.doubleFirst(z);     
      out.print("           After calling doubleFirst(z):  ");                   
      StaticListFunHouse.print(z);
      out.println(); 

      StaticListFunHouse.doubleLast(z);      
      out.print("            After calling doubleLast(z):  ");                   
      StaticListFunHouse.print(z);
      out.println();          

      StaticListFunHouse.skipEveryOther(z);     
      out.print("        After calling skipEveryOther(z):  ");                   
      StaticListFunHouse.print(z);
      out.println();       
      
      StaticListFunHouse.removeEveryXthNode(z,2);     
      out.print(" After calling removeEveryXthNode(z,2):  ");             
      StaticListFunHouse.print(z);
      out.println();       
      
      StaticListFunHouse.setEveryXthNode(z,2,"one");     
      out.print("After calling setEveryXthNode(z,2,one):  ");                            
      StaticListFunHouse.print(z);
      out.println();          
   }
}
