
public class DuckCall implements Quackable {
	Observable observable;
	
	public DuckCall(){
		observable =new Observable(this);
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("kwak");
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO 自动生成的方法存根
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO 自动生成的方法存根
		observable.notifyObservers();
	}

}
