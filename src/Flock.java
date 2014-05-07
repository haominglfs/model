import java.util.ArrayList;
import java.util.Iterator;


public class Flock implements Quackable {
	ArrayList<Quackable> quackers=new ArrayList<Quackable>();
	Observable observable;
	
	public Flock(){
		observable=new Observable(this);
	}
	public void add(Quackable quacker){
		quackers.add(quacker);
	}
	@Override
	public void quack() {
		// TODO 自动生成的方法存根
		Iterator<Quackable> iterator=quackers.iterator();
		while(iterator.hasNext()){
			Quackable quacker=iterator.next();
			quacker.quack();
			notifyObservers();
		}
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
