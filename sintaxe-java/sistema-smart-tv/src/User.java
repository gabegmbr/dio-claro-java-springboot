public class User {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();
        System.out.println("Is the TV turned on? " + smartTV.turnedOn);
        System.out.println("Current channel: " + smartTV.channel);
        System.out.println("Current volume: " + smartTV.volumeLevel);

        smartTV.changePowerState();
        System.out.println("New state: Is the TV turned on? " + smartTV.turnedOn);

        smartTV.changePowerState();
        System.out.println("New state: Is the TV turned on? " + smartTV.turnedOn);

        smartTV.changePowerState();
        System.out.println("New state: Is the TV turned on? " + smartTV.turnedOn);

        smartTV.changeVolume(false);
        smartTV.changeVolume(false);
        smartTV.changeVolume(false);
        smartTV.changeVolume(false);

        smartTV.changeVolume(true);
        smartTV.changeVolume(true);
        smartTV.changeVolume(true);
        System.out.println("Current volume: " + smartTV.volumeLevel);

        smartTV.changeChannel(13);
        System.out.println("Current channel: " + smartTV.channel);

        smartTV.changeChannelByStep(false);
        System.out.println("Current channel: " + smartTV.channel);
        smartTV.changeChannelByStep(true);
        System.out.println("Current channel: " + smartTV.channel);
    }
}
