package inheritance;

public class Nokia1100 extends PreNokia1100{
   String nameOfTheClass="Nokia";
   static int  a=10;
   public void Nokia1100(){
      System.out.println("****Nokia1100***");
   }
   public void Nokia1100(int a){
      System.out.println(a);
   }
   @Override
   public void makeCall() {
      System.out.println("calling...");
   }

   @Override
   public void contactList() {
      super.contactList();
   }

   @Override
   public void sendText() {
      super.sendText();
   }

   @Override
   public void display() {
      super.display();
      System.out.println("pick color for "+nameOfTheClass);
   }

   /**
     * Make necessary changes to inherit PreNokia1100
     * Declare and assign value to a String instance variable called nameOfTheClass
     * Implement a method to add photo gallery photoGallery()
     * Create default constructor and a parameterized constructor with int x parameter
     * */
  public void photoGallery(){
     System.out.println("colletion of photos in "+ nameOfTheClass);
  }
   public static void main(String[] args) {
      Nokia1100 nokia1100=new Nokia1100();
      nokia1100.makeCall();
      nokia1100.sendText();
      nokia1100.contactList();
      nokia1100.display();
      nokia1100.photoGallery();
      nokia1100.Nokia1100();
      nokia1100.Nokia1100(a);
   }
   }
