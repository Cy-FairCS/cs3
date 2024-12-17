import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.Arrays;

public class Precedence_Notes {
    
    public static void main(String[] args)
    {
        //#1
        {
           out.println("#1");
           int a=2, b=4, c=5, d=3;
           out.println(a + (b + c) * d);       
           out.println();
        }

        //#2
        {
           out.println("#2");
           int a=2, b=4, c=5, d=3;
           out.println( c + a * Math.round(2.6 + b) );          
           out.println();
        }

        //#3
        {
           out.println("#3");
           int a=2, b=4, c=5, d=3;
           out.println( min( pow(c,a) , pow(b,d) ) );          
           out.println();
        }
    
        //#4
        {
           out.println("#4");
           int a=2, b=4, c=5, d=3;
           out.println( (a + b) + ++b );
           out.println();
        }         
     
        //#5
        {
           out.println("#5");
           int a=2, b=4, c=5, d=3;
           out.println( c /= ++c );
           out.println();
        }         
        	
        //#6
        {
           out.println("#6");
           int a=2, b=4, c=5, d=3;
           out.println( (b = 2 * b) + (b + b)  );
           out.println();
        }

        //#6
        {
           out.println("#6b");
           int a=2, b=4, c=5, d=3;
           out.println( (b = 2 + b) + (b * b)  );
           out.println();
        }
        //#7
        {
           out.println("#7");
           int a=2, b=4, c=5, d=3;           
           int f = a>0 ? (int)2.7 : (int)2.3;
           out.println( f );         
           out.println();
        }
    
        //#8
        {
           out.println("#8");
           int a=2, b=4, c=5, d=3;
           int[] g = {6,4,2,9,3,2,0,6,8,9,5};
            
           out.println( g[ g[b] + g[a] ] );   
           out.println();
        }

        //#9
        {
           out.println("#9");
           System.out.println(3+5);
           out.println();
        }
 
        
    }
}