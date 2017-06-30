package pattern.bridge;

public class FXGui implements GuiAPI {
    @Override
    public void createGui() {
        System.out.println("Create GUI in Java FX");
    }
}
