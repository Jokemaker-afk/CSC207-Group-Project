package LogIn.LoggedIn;

import DataObjects.UserObject;
import LogIn.Welcome.WelcomeController;
import Transaction.MakeTransaction.MakeTransactionController;
import Transaction.SeeTransactionHistory.SeeTransactionHistoryController;

public class LoggedInController {
    UserObject loggedInUser;
    private LoggedInPresenter loggedInPresenter;
    private WelcomeController welcomeController;
    private MakeTransactionController makeTransactionController;
    private SeeTransactionHistoryController seeTransactionHistoryController;

    public LoggedInController(UserObject user) {
        this.loggedInUser = user;
        this.welcomeController = new WelcomeController();
        this.makeTransactionController = new MakeTransactionController(loggedInUser);
        this.seeTransactionHistoryController = new SeeTransactionHistoryController(loggedInUser);

        // at last
        this.loggedInPresenter = new LoggedInPresenter(this);
    }

    public void launch(){
        loggedInPresenter.showView();
    }

    public void logOutTriggered() {
        loggedInPresenter.disposeView();
        welcomeController.launch();
    }

    public void sendMoneyTriggered() {
        loggedInPresenter.disposeView();
        makeTransactionController.launch();
    }

    public void seeTransactionHistoryTriggered() {
        loggedInPresenter.disposeView();
        seeTransactionHistoryController.launch();
    }

    public void buyAssetsTriggered() {
        loggedInPresenter.disposeView();
        //buyAssetsController.launch();
    }
}

