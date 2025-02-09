package Observer;

import Observable.StocksObservable;

public class MobileAlertObserverImp implements NotificationAlertObserver{
    String username;
    StocksObservable observable;

    public MobileAlertObserverImp(String username, StocksObservable observable){
        this.username = username;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendEmail(username, "Product has been added");
    }
    private void sendEmail(String username, String msg) {
        System.out.println("Message sent to : " + username + " --> "+ msg);
    }
}
