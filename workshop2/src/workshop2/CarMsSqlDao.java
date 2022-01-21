package workshop2;

public class CarMsSqlDao implements CarDao {

	@Override
	public void add(Car car) {
		// TODO Auto-generated method stub
		System.out.println("Ms Sql'a eklendi");
	}

	@Override
	public void delete(Car car) {
		// TODO Auto-generated method stub
		System.out.println("MS Sql'den silindi");
	}

	@Override
	public void update(Car car) {
		// TODO Auto-generated method stub
		System.out.println("Ms Sql'de güncellendi.");
	}

}
