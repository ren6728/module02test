package inheritance;

public abstract class PreNokia1100 implements SymbianPhone {

    /**
     *
     * Implement interface SymbianPhone
     * Make necessary changes to make this class abstract
     *
     * Think Nokia company is planning to add a colorful display in future
     * but they cant implement that feature now. This implementation can be done by display()
     * Declare and assign value to a String instance variable called nameOfTheClass
     *
     *
     * */

    public void sendText() {
        System.out.println("sending text...");
    }

    @Override
    public void contactList() {
        System.out.println("Contacts List: ");
    }

public void display(){

};
    public abstract void makeCall();

}
