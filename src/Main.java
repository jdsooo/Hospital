import backEnde.BackEnde;
import view.LoginView;
import controller.LoginController;

public class Main {
    public static void main(String[] args) {

        LoginView loginView = new LoginView();
        BackEnde backEnde=new BackEnde();

        new LoginController(loginView,backEnde);
        loginView.setVisible(true);
    }
}