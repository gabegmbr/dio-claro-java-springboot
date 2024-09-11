package iphone.core.apps;
import iphone.core.functionalities.Telephone;

public class PhoneApp implements Telephone {
    public void callTo(String number){
        System.out.println("Phone: Calling to " + number);
    }
    public void answerCall(){
        System.out.println("Phone: Answering call");
    }
    public void startVoiceMail(){
        System.out.println("Phone: Opening Voice Mail Interface...");
    }
}
