package pattern.bridge;

public class Main {
    public static void main(String[] args) {
        Gui swingGUI = new ConcreteGui(new SwingGui());
        Gui fxGUI = new ConcreteGui(new FXGui());
        Gui webGUI = new ConcreteGui(new WebGui());

        swingGUI.create();
        fxGUI.create();
        webGUI.create();
    }
}
