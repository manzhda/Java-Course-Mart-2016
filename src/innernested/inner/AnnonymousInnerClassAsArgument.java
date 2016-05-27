package innernested.inner;

//interface
interface Message{
   String greet();	
}

public class AnnonymousInnerClassAsArgument {
   //method which accepts the object of interface Message
   public void displayMessage(Message m){
      System.out.println(m.greet() +", This is an example of anonymous inner calss as an argument");	   
   }

   public static void main(String args[]){
      //Instantiating the class
      AnnonymousInnerClassAsArgument obj = new AnnonymousInnerClassAsArgument();

      //Passing an anonymous inner class as an argument
      Message m = new Message() {
         public String greet() {
            return "Hello";
         }
      };
      System.out.println(m);
      obj.displayMessage(m);



      obj.displayMessage(new Message() {
         public String greet() {
            return "Money";
         }
      });
   }
}