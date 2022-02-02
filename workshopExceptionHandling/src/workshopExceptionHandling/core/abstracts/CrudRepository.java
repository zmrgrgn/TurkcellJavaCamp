package workshopExceptionHandling.core.abstracts;

import java.util.ArrayList;

import workshopExceptionHandling.core.concretes.Entity;

public interface CrudRepository<T extends Entity> {
	void add(T entity);
	void update(T entity);
	void delete(T entity);
	ArrayList<T> getAll();
}
