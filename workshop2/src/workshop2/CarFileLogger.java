package workshop2;

public class CarFileLogger implements CarLogger {

	@Override
	public void add(Car car) {
		// TODO Auto-generated method stub
		System.out.println("Dosyaya loglandý");
	}

	@Override
	public void delete(Car car) {
		// TODO Auto-generated method stub
		System.out.println("Dosyadan silindi");
	}

	@Override
	public void update(Car car) {
		// TODO Auto-generated method stub
		System.out.println("Dosyada güncellendi");
	}

}
