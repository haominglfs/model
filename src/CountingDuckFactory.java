
public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		// TODO 自动生成的方法存根
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createRedheadDuck() {
		// TODO 自动生成的方法存根
		return new QuackCounter(new RedheadDuck());
	}

	@Override
	public Quackable createDuckCall() {
		// TODO 自动生成的方法存根
		return new QuackCounter(new DuckCall());
	}

}
