import static java.lang.System.*;
import java.util.Arrays;

public class MergeSortCollegeBoardVerbose
{
   public static int[] quiz2_5 = {40, 45, 87, 3, 80, 13, 1};//, 35};
   public static int[] ws2_7 = {13, 23, 91, 1, 37, 11, 89, 83, 71, 5, 53, 19, 67, 17, 29, 31};
   public static int[] ws2_8 = {50, 55, 13, 96, 90, 23, 11, 43, 18}; 
   public static int[] ws3_1c = {26, 48, 12, 92, 28, 6, 33};
   public static int[] array = ws3_1c;
   
   public static void main(String[] args)
   {
      System.out.println("Before:  " + Arrays.toString(array) + "\n");
      mergeSort(array);
      System.out.println("\nAfter:  " + Arrays.toString(array));
   }
   
   /**
   * Sort an array of integers into ascending order.
   *
   * @param elements an array containing the items to be sorted.
   *
   * Postcondition: elements contains its original items and items in elements
   * are sorted in ascending order.
   */
   public static void mergeSort(int[] elements)
   {
      int n = elements.length;
      int[] temp = new int[n];
      mergeSortHelper(elements, 0, n - 1, temp);
   }
   
   /**
   * Sorts elements[from] ... elements[to] inclusive into ascending order.
   *
   * @param elements an array containing the items to be sorted.
   * @param from the beginning index of the items in elements to be sorted.
   * @param to the ending index of the items in elements to be sorted.
   * @param temp a temporary array to use during the merge process.
   *
   * Precondition:
   * (elements.length == 0 or
   * 0 <= from <= to <= elements.length) and
   * elements.length == temp.length
   * Postcondition: elements contains its original items and the items in elements
   * [from] ... <= elements[to] are sorted in ascending order.
   */
   private static void mergeSortHelper(int[] elements,int from, int to, int[] temp)
   {
      if (from < to)
      {
         int middle = (from + to) / 2;
         mergeSortHelper(elements, from, middle, temp);
         mergeSortHelper(elements, middle + 1, to, temp);
         merge(elements, from, middle, to, temp);
      }
   }   

   /**
   * Merges two adjacent array parts, each of which has been sorted into ascending
   * order, into one array part that is sorted into ascending order.
   *
   * @param elements an array containing the parts to be merged.
   * @param from the beginning index in elements of the first part.
   * @param mid the ending index in elements of the first part.
   * mid+1 is the beginning index in elements of the second part.
   * @param to the ending index in elements of the second part.
   * @param temp a temporary array to use during the merge process.
   *
   * Precondition: 0 <= from <= mid <= to <= elements.length and
   * elements[from] ... <= elements[mid] are sorted in ascending order and
   * elements[mid + 1] ... <= elements[to] are sorted in ascending order and
   * elements.length == temp.length
   * Postcondition: elements contains its original items and
   * elements[from] ... <= elements[to] are sorted in ascending order and
   * elements[0] ... elements[from - 1] are in original order and
   * elements[to + 1] ... elements[elements.length - 1] are in original order.
   */
   private static void merge(int[] elements, int from, int mid, int to, int[] temp) {
      int i = from;
      int j = mid + 1;
      int k = from;
      while (i <= mid && j <= to) {
         if (elements[i] < elements[j]) {
            temp[k] = elements[i];
            i++;
         }
         else {
            temp[k] = elements[j];
            j++;
         }
         k++;
      }
      while (i <= mid) {
         temp[k] = elements[i];
         i++;
         k++;
      }
      while (j <= to) {
         temp[k] = elements[j];
         j++;
         k++;
      }
      for (k = from; k <= to; k++) {
         elements[k] = temp[k];
      }
      System.out.println(Arrays.toString(array) + "\t\tfrom: " + from + "\tto: " + to);
   }
}

