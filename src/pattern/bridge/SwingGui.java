package pattern.bridge;

public class SwingGui implements GuiAPI {
    @Override
    public void createGui() {
        System.out.println("Create GUI in Swing");
    }
}
