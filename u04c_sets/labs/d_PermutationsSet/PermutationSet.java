import java.util.HashSet;
import java.util.Set;

public class PermutationSet
{
   public static Set<String> permutations(String word) {
      // Make a HashSet to store the permutations of <code>word</code>
      //Handling error scenarios
      if (word == null || word.length() == 0) {
         // If <code>word</code> is the empty string, add it to your set before returning the set.
         return perms;
      }
      char initial; // store the first character
      String rem; // Store the rest of the string
      // Call permuations() on rem and store the set it gives you
      // Loop through each permutation of rem
         // Loop through each spot of the current word from rem 
            // Insert <code>init</code> at the current spot
            // Add this permutation to our set of permutations.
      return null;
   }
}