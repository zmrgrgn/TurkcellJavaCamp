package workshop2;

public class CarManager implements CarService{
	private CarDao carDao;
	private CarLogger carLogger;
	
	
	public CarManager() {
		super();
	}

	public CarManager(CarDao carDao, CarLogger carLogger) {
		super();
		this.carDao = carDao;
		this.carLogger = carLogger;
	}

	@Override
	public void add(Car car) {
		carDao.add(car);
		carLogger.add(car);
	}

	@Override
	public void delete(Car car) {
		carDao.delete(car);
		carLogger.delete(car);
	}

	@Override
	public void update(Car car) {
		carDao.update(car);
		carLogger.update(car);
	}

}
