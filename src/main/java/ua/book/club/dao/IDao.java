package ua.book.club.dao;

import java.util.List;

import ua.book.club.domain.IIdentifiable;

public interface IDao<T extends IIdentifiable> {

	public T get(long id);

	public List<T> listAll();

	public void insert(T entity);

	public void update(T entity, String entityName);

	public void delete(T entity);

}
