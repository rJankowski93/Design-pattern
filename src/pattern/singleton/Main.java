package pattern.singleton;

public class Main {
    public static void main(String[] args) {
        AppConfig appConfig = AppConfig.getInstance();
        AppConfig appConfig2 = AppConfig.getInstance();

        System.out.println("The same objects: " + (appConfig == appConfig2));
    }
}
