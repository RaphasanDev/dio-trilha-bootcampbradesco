package teoriainterfaces;

public class MusicBox implements MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("O musciBox está tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O musciBox está pausando música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O musciBox está parando música");
    }

}
