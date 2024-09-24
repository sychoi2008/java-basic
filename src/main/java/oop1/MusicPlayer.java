package oop1;

public class MusicPlayer {
    int volume;
    boolean isOn;

    void on(){
        isOn = true;
        System.out.println("Turn On The Player");
    }
    void off(){
        isOn = false;
        System.out.println("turn off the player");
    }

    void volumeUp() {
        volume++;
        System.out.println("Volumn : "+ volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("Volume : "+ volume);
    }
    void showStatus(){
        if(isOn) {
            System.out.println("Player is on! : " + volume);
        } else {
            System.out.println("Player is off! : ");
        }
    }
}
