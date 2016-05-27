package innernested.nested;

public class Outer{
   static class NestedDemo {
      public void my_method(){
         System.out.println("This is my nested class");
      }
   }
   
   public static void main(String args[]){
      NestedDemo nested = new NestedDemo();
      nested.my_method();

      System.out.println(nested);
   }
   
}