package teoriainterfaces;

public class SmartPhone implements VideoPlayer{

    @Override
    public void playVideo() {
        System.out.println("O smartphone está tocando video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O smartphone está pausando video");
    }

    @Override
    public void stopVideo() {
        System.out.println("O smartphone está parando video");
    }

    @Override
    public void playMusic() {
        System.out.println("O smartphone está tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O smartphone está pausando música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O smartphone está parando música");
    }

}
