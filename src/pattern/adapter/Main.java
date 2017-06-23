package pattern.adapter;

public class Main {
    public static void main(String[] args) {
//        IMPLEMENTACJA BEZ UŻYCIA ADPATER'a
//        Object[] players = {new PlayerAVI(), new PlayerMP4()};
//        Object movie = new Object();
//        for (Object player: players) {
//            if (player.getClass().getSimpleName().equals("PlayerAVI")) {
//                ((PlayerAVI)player).play(movie);
//            } else if (player.getClass().getSimpleName().equals("PlayerMP4")) {
//                ((PlayerMP4)player).play(movie);
//            }
//        }

//        IMPLEMENTACJA Z UŻYCIEM ADPATER'a
        Player[] players = {new PlayerAVIAdapter(new PlayerAVI()), new PlayerMP4Adapter(new PlayerMP4())};
        Object movie = new Object();
        for (Player player: players) {
           player.play(movie);
        }
    }


}
