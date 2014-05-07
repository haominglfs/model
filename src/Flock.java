import java.util.ArrayList;
import java.util.Iterator;


public class Flock implements Quackable {
	ArrayList<Quackable> quackers=new ArrayList<Quackable>();
	
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
		}
	}

}
