package innernested.inner;

public class OuterMethodLocalInnerClass {
   
   //instance method of the outer class 
   void myMethod(){
      int num = 23;
   
      //method-local inner class
      class MethodInnerDemo {
         public void print(){
            System.out.println("This is method inner class "+num);	   
         }   
      }//end of inner class

      //Accessing the inner class
      MethodInnerDemo inner = new MethodInnerDemo();
      inner.print();
   }
   
   public static void main(String args[]){
      OuterMethodLocalInnerClass outer = new OuterMethodLocalInnerClass();
      outer.myMethod();
   }
}