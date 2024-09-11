import iphone.core.apps.*;

public class iPhone {
    public static void main(String[] args) {
        PhoneApp Phone = new PhoneApp();
        MusicApp iPod = new MusicApp();
        WebApp Safari = new WebApp();
        Phone.callTo("911");
        Phone.answerCall();
        Phone.startVoiceMail();
        iPod.play();
        iPod.pause();
        iPod.selectSong("AMERICA HAS A PROBLEM");
        Safari.openWebSite("www.google.com");
        Safari.refreshTab();
        Safari.newTab();
    }
}
