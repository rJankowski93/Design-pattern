package pattern.bridge;

public class WebGui implements GuiAPI{
    @Override
    public void createGui() {
        System.out.println("Create GUI in Web");
    }
}
