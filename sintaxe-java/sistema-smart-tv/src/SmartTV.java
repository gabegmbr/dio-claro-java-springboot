public class SmartTV {
    boolean turnedOn = false;
    int channel = 1;
    int volumeLevel = 25;

    public void changePowerState(){
        turnedOn = !turnedOn;
    }

    public void changeVolume(boolean increase){
        if (increase){
            volumeLevel++;  
            System.out.println("Increasing volume: " + volumeLevel);
        } 
        else {
            volumeLevel--;
            System.out.println("Decreasing volume: " + volumeLevel);
        }
    }

    public void changeChannelByStep(boolean increase){
        if (increase) channel++;  
        else channel--;
        System.out.println("Changing channel to: " + channel);
    }

    public void changeChannel(int specifiedChannel){
        channel = specifiedChannel;
        System.out.println("Changing channel to: " + channel);
    }
}
