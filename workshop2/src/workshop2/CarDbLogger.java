package workshop2;

public class CarDbLogger implements CarLogger {

	@Override
	public void add(Car car) {
		// TODO Auto-generated method stub
System.out.println("Db'ye loglandý");
	}

	@Override
	public void delete(Car car) {
		// TODO Auto-generated method stub
		System.out.println("Db'den silindi");
	}

	@Override
	public void update(Car car) {
		// TODO Auto-generated method stub
		System.out.println("Db'de güncellendi");
	}

}
