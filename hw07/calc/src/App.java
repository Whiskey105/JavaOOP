import Controller.ControllerClass;
import View.MainView;

public class App {
    public static void main(String[] args) {

        MainView mainView = new MainView();

        ControllerClass controllerClass = new ControllerClass(mainView);
        controllerClass.run();
    }
}
