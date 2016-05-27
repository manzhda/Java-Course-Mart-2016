package innernested.inner;

class OuterDemo {
   int num;

   //inner class
   private class InnerDemo {
      public void print(){	   
         System.out.println("This is an inner class");
      }
   }

   //Accessing he inner class from the method within
   void display_Inner(){
      InnerDemo inner = new InnerDemo();
      inner.print();
   }
}
   
public class InnerSampleClass {
   public static void main(String args[]){
      //Instantiating the outer class 
      OuterDemo outer = new OuterDemo();
      //Accessing the display_Inner() method.
      outer.display_Inner();
   }

}