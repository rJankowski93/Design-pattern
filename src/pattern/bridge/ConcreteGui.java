package pattern.bridge;

public class ConcreteGui extends Gui {
    public ConcreteGui(GuiAPI guiAPI) {
        super(guiAPI);
    }

    @Override
    public void create() {
        guiAPI.createGui();
    }
}
