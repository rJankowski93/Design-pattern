package pattern.adapter;

public class PlayerMP4Adapter implements Player {

    private PlayerMP4 adaptee;

    public PlayerMP4Adapter(PlayerMP4 playerMP4) {
        this.adaptee = playerMP4;
    }

    @Override
    public void play(Object movie) {
        adaptee.play(movie);
    }
}
