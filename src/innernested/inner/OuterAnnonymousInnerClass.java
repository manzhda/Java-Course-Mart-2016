package innernested.inner;

abstract class AnonymousInner{
   public abstract void myMethod();
}


class AnonymousInnerImpl extends AnonymousInner{

   @Override
   public void myMethod() {
      System.out.println("This is an example of AnonymousInnerImpl class");
   }
}

public class OuterAnnonymousInnerClass {
   public static void main(String args[]){
      AnonymousInner innerFirst = new AnonymousInner(){
         public void myMethod(){
            System.out.println("This is an example of anonymous innerFirst class");
         }
      };
      innerFirst.myMethod();

      AnonymousInner innerSecond = new AnonymousInner(){
         @Override
         public void myMethod() {
            System.out.println("This is an example of anonymous innerSecond class");
         }
      };
      innerSecond.myMethod();

      AnonymousInner innerThird = new AnonymousInner(){
         @Override
         public void myMethod() {
            System.out.println("This is an example of anonymous innerThird class");
         }
      };
      innerThird.myMethod();

      AnonymousInner innerFourth = new AnonymousInnerImpl();
      innerFourth.myMethod();


      System.out.println();

      System.out.println(innerFirst);
      System.out.println(innerSecond);
      System.out.println(innerThird);
      System.out.println(innerFourth);

   }
}