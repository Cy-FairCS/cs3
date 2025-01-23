import java.util.*;
import static java.lang.System.*;
import java.io.StringWriter;
import java.io.PrintWriter;

public class SinglyLinkedList_Runner
{
   public static void main ( String[] args )
   {
      test(new int[]{4,5,6,7,8,9,10,11,12,13}, 4, 14);
      pause();
      test(new int[]{24,75,86,37,82,94,111,82,43}, 37, 100);
      pause();
      test(new int[]{0,4,5,2,1,4,6}, 6, 7);
      pause();
      test(new int[0], 0, 0);
   }
   
   public static void test(int[] nums, int firstSearchItem, int secondSearchItem) {
      SinglyLinkedList list = new SinglyLinkedList();
      SinglyLinkedList list2 = new SinglyLinkedList();
      SinglyLinkedList list3 = new SinglyLinkedList();
      for(int num : nums) {
         list.add(num);
         list2.add(num);
         list3.add(num);
      }
      if (list.isEmpty()) {
         out.println("Empty List!");
         return;
      }
      out.println("*************************************************");      
      out.println("*** Test add, addFirst, addLast, and toString ***");
      out.println("*************************************************");      
      list3.addFirst(20);
      list3.addLast(40);
      out.println("    LIST:: "+list.toString());
      out.println("   LIST2:: "+list2.toString());
      out.println("   LIST3:: "+list3.toString());
      out.println();
      out.println("***************************************");
      out.println("*** Test get, getFirst, and getLast ***");
      out.println("***************************************");
      out.println("list.get(2) == " + list.get(2) + "\n");
      try {
         out.println("list.get(100) should throw an IndexOutOfBoundsException.");
         list3.get(100);
      } catch(IndexOutOfBoundsException e) {
         out.println("Here's the stack trace from your IndexOutOfBoundsException:");
         printStackTrace(e);
      } catch(NullPointerException e) {
         out.println("Your method threw a NullPointerException!!!");
      }   
      out.println("list.getFirst() == " + list.getFirst());
      out.println("list.getLast() == " + list.getFirst());
      out.println();
      out.println("Test size, contains, and equals:");
      out.println("list.size() == " + list.size());
      out.println("list.contains("+firstSearchItem+") == " + list.contains(firstSearchItem));
      out.println("list.contains("+secondSearchItem+") == " + list.contains(secondSearchItem));
      out.println("list.equals(list)? == "+list.equals(list));
      out.println("list.equals(list2)? == "+list.equals(list2));
      out.println("list.equals(list3)? == "+list.equals(list3));
      out.println();
      out.println("********************************************************************************");      
      out.println("*** Test set, remove(int), remove(obj), removeFirst, and removeLast on list3 ***");
      out.println("********************************************************************************");      
      out.println("LIST3:: "+list3.toString());
      out.println("set(2, 100) returned " + list3.set(2, 100));
      out.println("LIST3 after set(2, 100): "+list3.toString() + "\n");
      try {
         out.println("list3.set(100, 2) should throw an IndexOutOfBoundsException.");
         list3.set(100, 2);
      } catch(IndexOutOfBoundsException e) {
         out.println("Here's the stack trace from your IndexOutOfBoundsException:");
         printStackTrace(e);
      } catch(NullPointerException e) {
         out.println("Your method threw a NullPointerException!!!");
      }   
      out.println("remove(2) returned " + list3.remove(2));
      out.println("LIST3 after remove(2):   "+list3.toString() + "\n");
      try {
         out.println("list.remove(100) should throw an IndexOutOfBoundsException.");
         list3.remove(100);
      } catch(IndexOutOfBoundsException e) {
         out.println("Here's the stack trace from your IndexOutOfBoundsException:");
         printStackTrace(e);
      } catch(NullPointerException e) {
         out.println("Your method threw a NullPointerException!!!");
      }          
      out.println("remove("+firstSearchItem+") returned " + list3.remove(Integer.valueOf(firstSearchItem)));
      out.println("LIST3 after remove("+firstSearchItem+"):   "+list3.toString());
      out.println("remove("+secondSearchItem+") returned " + list3.remove(Integer.valueOf(secondSearchItem)));
      out.println("LIST3 after remove("+secondSearchItem+"):   "+list3.toString());
      out.println("removeFirst() returned " + list3.removeFirst());
      out.println("LIST3 after removeFirst():   "+list3.toString()); 
      out.println("removeLast() returned " + list3.removeLast());
      out.println("LIST3 after removeLast():   "+list3.toString()); 
      out.println();
      out.println("*****************************************************************************");
      out.println("*** Test clear and that NullPointerExceptions are thrown when appropriate ***");
      out.println("*****************************************************************************");
      out.println("list3.clear()");
      list3.clear();
      out.println("list3 == " + list3 + "\n");
      try {
         out.println("list.getFirst() should throw an NoSuchElementException.");
         list3.getFirst();
      } catch(NoSuchElementException e) {
         out.println("Here's the stack trace from your NoSuchElementException:");
         printStackTrace(e);
      } catch(NullPointerException e) {
         out.println("Your method threw a NullPointerException!!!");
      } 
      try {
         out.println("list.getLast() should throw an NoSuchElementException.");
         list3.getLast();
      } catch(NoSuchElementException e) {
         out.println("Here's the stack trace from your NoSuchElementException:");
         printStackTrace(e);
      } catch(NullPointerException e) {
         out.println("Your method threw a NullPointerException!!!");
      } 
      try {
         out.println("list.removeFirst() should throw an NoSuchElementException.");
         list3.removeFirst();
      } catch(NoSuchElementException e) {
         out.println("Here's the stack trace from your NoSuchElementException:");
         printStackTrace(e);
      } catch(NullPointerException e) {
         out.println("Your method threw a NullPointerException!!!");
      } 
      try {
         out.println("list.removeLast() should throw an NoSuchElementException.");
         list3.removeLast();
      } catch(NoSuchElementException e) {
         out.println("Here's the stack trace from your NoSuchElementException:");
         printStackTrace(e);
      } catch(NullPointerException e) {
         out.println("Your method threw a NullPointerException!!!");
      } 
      out.println();
      out.println("*********************************");
      out.println("*** Test List Utility methods ***");
      out.println("*********************************");
      out.println("     SUM:: "+ListUtilities.getSum(list));
      out.println(" AVERAGE:: "+ListUtilities.getAvg(list));
      out.println("SMALLEST:: " + ListUtilities.getSmallest(list));
      out.println(" LARGEST:: "+ListUtilities.getLargest(list));
      out.println();      
   }
   
   private static void printStackTrace(Exception e) {
      StringWriter sw = new StringWriter();
      PrintWriter pw = new PrintWriter(sw);
      e.printStackTrace(pw);
      String sStackTrace = sw.toString(); // stack trace as a string
      System.out.println(sStackTrace);
   }
   
   public static void pause(int delay) {
      try
      {
         Thread.currentThread();
         Thread.sleep(delay);
      }
      catch(InterruptedException e) { }
   }
    
   private static void pause() {
      System.out.print("\nPress ENTER to continue...");
      (new java.util.Scanner(System.in)).nextLine();
   }
}