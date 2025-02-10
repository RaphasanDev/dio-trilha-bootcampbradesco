package teoriainterfaces;

public class Computer implements VideoPlayer{

    @Override
    public void playVideo() {
        System.out.println("O computador está tocando video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O computador está pausando video");
    }

    @Override
    public void stopVideo() {
        System.out.println("O computador está parando video");
    }

    @Override
    public void playMusic() {
        System.out.println("O computador está tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O computador está pausando música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O computador está parando música");
    }

}
