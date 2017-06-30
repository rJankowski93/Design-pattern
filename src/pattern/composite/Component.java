package pattern.composite;

public interface Component {
    default void add(Component component) {
    }

    default void remove(Component component) {
    }

    void show();

    void changeSalary(float percent);
}
