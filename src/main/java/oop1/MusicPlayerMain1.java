package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volumn = 0;
        boolean isOn = false;

        // turn on the player
        isOn = true;
        System.out.println("Turn On The Player");

        // turn up the player
        volumn++;
        System.out.println("Volumn : "+ volumn);
        volumn++;
        System.out.println("Volumn : "+ volumn);
        // turn down the player
        volumn--;
        System.out.println("Volumn : "+ volumn);

        // 음악 플레이어 상태
        if(isOn) {
            System.out.println("Player is on! : " + volumn);
        } else {
            System.out.println("Player is off! : ");
        }

        // 플레이어 끄기
        isOn = false;
        System.out.println("turn off the player");
    }
}
