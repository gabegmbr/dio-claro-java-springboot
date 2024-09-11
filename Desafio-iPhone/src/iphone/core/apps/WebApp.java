package iphone.core.apps;
import iphone.core.functionalities.WebBroswer;

public class WebApp implements WebBroswer {
    public void openWebSite(String url) {
        System.out.println("Safari: Opening webpage " + url);
    }
    public void newTab() {
        System.out.println("Safari: New tab created");
    }
    public void refreshTab() {
        System.out.println("Safari: Refresing webpage...");
    }
}
