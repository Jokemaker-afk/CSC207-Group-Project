package LogIn.LoggedIn;

public class LoggedInPresenter{
    private final LoggedInView loggedInView;

    public LoggedInPresenter(LoggedInController controller){
        this.loggedInView = new LoggedInView(controller);
    }

    public void showView(){
        loggedInView.setVisible(true);
    }

    public void disposeView(){
        loggedInView.setVisible(false);
        loggedInView.dispose();
    }
}
