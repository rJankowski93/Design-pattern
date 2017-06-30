package pattern.bridge;

public abstract class Gui {
    protected GuiAPI guiAPI;

    public Gui(GuiAPI guiAPI) {
        this.guiAPI = guiAPI;
    }

    public abstract void create();
}
