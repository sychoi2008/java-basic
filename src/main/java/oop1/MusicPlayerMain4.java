package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        // turn on the player
        player.on();

        // turn up the player
        player.volumeUp();
        player.volumeUp();
        // turn down the player
        player.volumeDown();

        // 음악 플레이어 상태
        player.showStatus();
        // 플레이어 끄기
        player.off();
    }
}
