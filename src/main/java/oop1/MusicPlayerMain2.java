package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();


        // turn on the player
        on(data);

        // turn up the player
        volumeUp(data);
        volumeUp(data);
        // turn down the player
        volumeDown(data);


        // 음악 플레이어 상태
        showStatus(data);

        // 플레이어 끄기
        off(data);

    }

    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("Turn On The Player");
    }
    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("turn off the player");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("Volumn : "+ data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("Volume : "+ data.volume);
    }
    static void showStatus(MusicPlayerData data){
        if(data.isOn) {
            System.out.println("Player is on! : " + data.volume);
        } else {
            System.out.println("Player is off! : ");
        }
    }
}
