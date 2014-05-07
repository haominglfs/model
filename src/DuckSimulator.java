
public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuckSimulator simulstor=new DuckSimulator();
		AbstractDuckFactory duckFactory=new CountingDuckFactory();
		
		simulstor.simulate(duckFactory);
	}
	
	void simulate(AbstractDuckFactory duckFactory){
//		Quackable mallardDuck=new QuackCounter(new MallardDuck());
//		Quackable redheadDuck=new QuackCounter(new RedheadDuck());
//		Quackable duckCall=new QuackCounter(new DuckCall());
//		Quackable gooseDuck=new GooseAdapter(new Goose());
		
		Quackable mallardDuck=duckFactory.createMallardDuck();
		Quackable redheadDuck=duckFactory.createRedheadDuck();
		Quackable duckCall=duckFactory.createDuckCall();
		Quackable gooseDuck=new GooseAdapter(new Goose());
		
		System.out.println("\nDuck simulator:with decotator");
		
		Flock flockOfDucks=new Flock();
		
		flockOfDucks.add(mallardDuck);
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		
		Flock flockOfMallards=new Flock();
		
		Quackable mallardOne=duckFactory.createMallardDuck();
		Quackable mallardTwo=duckFactory.createMallardDuck();
		Quackable mallardThree=duckFactory.createMallardDuck();
		
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		
		flockOfDucks.add(flockOfMallards);
		
		simulate(flockOfDucks);
//		simulate(redheadDuck);
//		simulate(duckCall);
//		simulate(gooseDuck);
		
		System.out.println("the ducks quacked "+QuackCounter.getQuacks()+" times");
	}
	
	void simulate(Quackable duck){
		duck.quack();
	}

}
