package Observer;

import Observable.StocksObservable;

public class EmailAlertObserverImp implements NotificationAlertObserver{
    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImp(String emailId, StocksObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendEmail(emailId, "Product has been added");
    }
    private void sendEmail(String emailId, String msg) {
        System.out.println("Mail sent to : " + emailId + " --> "+ msg);
    }
}
