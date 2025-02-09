import Observable.IphoneObservableImp;
import Observable.StocksObservable;
import Observer.EmailAlertObserverImp;
import Observer.MobileAlertObserverImp;
import Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IphoneObservableImp();
        NotificationAlertObserver observer1 = new EmailAlertObserverImp("umang@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImp("umang",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.setStockCount(10);
        System.out.println(iphoneStockObservable.getStockCount());
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(10);
    }
}