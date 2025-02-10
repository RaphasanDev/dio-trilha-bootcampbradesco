package teoriainterfaces.src;

public class Main {

  
    public static void main(String[] args) {
        Computer musicPlayer = new Computer();

        runMusic(musicPlayer);
    }

    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }
}
