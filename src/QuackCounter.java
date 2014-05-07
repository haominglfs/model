
public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks;
	
	public QuackCounter(Quackable duck){
		this.duck=duck;
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		duck.quack();
		numberOfQuacks++;
	}
	
	public static int getQuacks(){
		return numberOfQuacks;
	}
	@Override
	public void registerObserver(Observer observer) {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void notifyObservers() {
		// TODO 自动生成的方法存根
		
	}

}
