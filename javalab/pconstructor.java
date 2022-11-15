class Car {
	String name;	
	 
	public Car(String name) {
		this.name = name;
	}
	
	void run(){
		System.out.println(name+" Car is running...");
	}
}

class Sample {

	public static void main(String[] args) {		
 
		Car maruti = new Car("Maruti");	
		maruti.run();
		
		Car honda = new Car("honda");
		honda.run();		
		
	}

}

