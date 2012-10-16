package ua.book.club.service;

import java.util.List;

import ua.book.club.domain.IIdentifiable;

public interface IService<T extends IIdentifiable> {

	T get(long id);

	List<T> listAll();

	void insert(T entity);

	void update(T entity, String entityName);

	void delete(T entity);

}
