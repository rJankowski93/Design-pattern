package pattern.adapter;

public class PlayerAVIAdapter implements Player {

    private PlayerAVI adaptee;

    public PlayerAVIAdapter(PlayerAVI playerAVI) {
        this.adaptee = playerAVI;
    }

    @Override
    public void play(Object movie) {
        adaptee.play(movie);
    }
}
