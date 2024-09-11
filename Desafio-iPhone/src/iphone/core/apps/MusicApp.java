package iphone.core.apps;
import iphone.core.functionalities.MusicPlayer;

public class MusicApp implements MusicPlayer {
    public void play() {
        System.out.println("iPod: Playing");
    }
    public void pause(){
        System.out.println("iPod: Paused");
    }
    public void selectSong(String song){
        System.out.println("iPod: Now playing " + song);
    }
}
