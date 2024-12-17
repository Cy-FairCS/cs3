import static java.lang.System.*;
import java.util.Arrays;

public class MyClass {

	public void outerMethod() { out.println("Outer"); }
   
   static class StaticInnerClass {
      public void staticInnerMethod() { out.println("Static Inner"); }
   }

   class InnerClass {
      public void innerMethod() { out.println("Inner"); }
   }
      
	public static void main(String[] args)
	{
      new MyClass().outerMethod();
      (new MyClass()).outerMethod();
      //new (MyClass().outerMethod());
      new MyClass.StaticInnerClass().staticInnerMethod();
      (new MyClass.StaticInnerClass()).staticInnerMethod();

      MyClass obj = new MyClass();
      obj.new InnerClass().innerMethod();
      new MyClass().new InnerClass().innerMethod();
      (new MyClass().new InnerClass()).innerMethod();
      
	}
}