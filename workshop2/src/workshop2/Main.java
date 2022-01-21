package workshop2;

public class Main {

	public static void main(String[] args) {
		Brand brand1=new Brand(1,"Mercedes");
		Color color1=new Color(1,"Siyah");
		Car car=new Car(1,"Deneme");
		car.setBrand(brand1);
		car.setColor(color1);

		CarManager carManager=new CarManager(new CarMsSqlDao(),new CarFileLogger());
		carManager.add(car);
		carManager.delete(car);
		carManager.update(car);

	}

}
