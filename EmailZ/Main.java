//Email Application
package emailapp;

public class EmailApp {

    public static void main(String[] args) {
        Email em1 = new Email("John", "Smith");

        System.out.println(em1.showInfo());

        //em1.setMailboxCapacity(Capacity);
        //em1.setAltEmail(altEmail);
        //System.out.println(em1.getAlternateEmail());
    }



}