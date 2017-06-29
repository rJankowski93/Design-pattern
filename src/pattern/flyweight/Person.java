package pattern.flyweight;

public class Person {
    private String type;
    private int x;
    private int y;

    public Person(String type) {
        this.type = type;
    }

    public void show() {
        System.out.println("[Type : " + type + ", x : " + x + ", y : " + y + "]");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
