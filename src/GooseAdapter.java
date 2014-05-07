
public class GooseAdapter implements Quackable {
	Goose goose;
	
	public GooseAdapter(Goose goose){
		this.goose=goose;
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		goose.honk();
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
