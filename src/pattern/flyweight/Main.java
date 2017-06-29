package pattern.flyweight;


public class Main {

    private static final String types[] = { "Man", "Woman", "Child"};

    public static void main(String[] args) {
        for(int i=0; i<10 ; i++) {
            Person person = PersonFactory.getPerson(getRandomType());
            person.setX(getRandomX());
            person.setY(getRandomY());
            person.show();
        }
    }

    private static String getRandomType() {
        return types[(int)(Math.random()*types.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
