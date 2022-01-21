package workshop2;

public class CarOracleDao implements CarDao {

	@Override
	public void add(Car car) {
		// TODO Auto-generated method stub
		System.out.println("Oracle'a eklendi");
	}

	@Override
	public void delete(Car car) {
		// TODO Auto-generated method stub
		System.out.println("Oracle'dan silindi");
	}

	@Override
	public void update(Car car) {
		// TODO Auto-generated method stub
		System.out.println("Oracle'da güncellendi");
	}

}
