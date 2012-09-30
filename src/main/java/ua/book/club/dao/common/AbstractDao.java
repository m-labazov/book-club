package ua.book.club.dao.common;

import java.util.List;

import ua.book.club.dao.IDao;
import ua.book.club.domain.IIdentifiable;

public class AbstractDao<T extends IIdentifiable> implements IDao<T> {

	@Override
	public T get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(T entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub

	}

}
