package teoriainterfaces.src;

public class Main {

  
    public static void main(String[] args) {
        Computer musicPlayer = new Computer();
        SmartPhone videoPlayer = new SmartPhone();
        

        runMusic(musicPlayer);
        stopMusic(musicPlayer);
        runVideo(videoPlayer);
    }

    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }

    public static void stopMusic(MusicPlayer musicPlayer) {
        musicPlayer.stopMusic();
    }

    public static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }
}
