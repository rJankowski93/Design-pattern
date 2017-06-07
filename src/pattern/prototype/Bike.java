package pattern.prototype;

public class Bike implements Cloneable {

    enum Color{
        Red, Green, Blue, Orange
    }

    private Color frame;

    private Color spokes;

    private Color tires;

    private Color handlebar;

    public Object clone() {
        try {
            return (Bike) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Bike(Color frame, Color spokes, Color tires, Color handlebar) {
        this.frame = frame;
        this.spokes = spokes;
        this.tires = tires;
        this.handlebar = handlebar;
    }

    public Color getFrame() {
        return frame;
    }

    public void setFrame(Color frame) {
        this.frame = frame;
    }

    public Color getSpokes() {
        return spokes;
    }

    public void setSpokes(Color spokes) {
        this.spokes = spokes;
    }

    public Color getTires() {
        return tires;
    }

    public void setTires(Color tires) {
        this.tires = tires;
    }

    public Color getHandlebar() {
        return handlebar;
    }

    public void setHandlebar(Color handlebar) {
        this.handlebar = handlebar;
    }

    @Override
    public String toString() {
        return "{" +
                "frame=" + frame +
                ", spokes=" + spokes +
                ", tires=" + tires +
                ", handlebar=" + handlebar +
                '}';
    }
}
