package ua.book.club.service.common;

import java.util.List;

import ua.book.club.dao.IDao;
import ua.book.club.domain.IIdentifiable;
import ua.book.club.service.IService;

public class AbstractService<T extends IIdentifiable, D extends IDao<T>>
		implements IService<T> {

	protected D dao;

	@Override
	public T get(long id) {
		T result = dao.get(id);
		return result;
	}

	@Override
	public List<T> listAll() {
		List<T> result = dao.listAll();
		return result;
	}

	@Override
	public void insert(T entity) {
		dao.insert(entity);
	}

	@Override
	public void delete(T entity) {
		dao.delete(entity);
	}

	@Override
	public void update(T entity, String entityName) {
		dao.update(entity, entityName);
	}

	public D getDao() {
		return dao;
	}

	public void setDao(D dao) {
		this.dao = dao;
	}

}
