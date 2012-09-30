package ua.book.club.service;

import java.util.List;

import ua.book.club.domain.IIdentifiable;

public interface IService<T extends IIdentifiable> {

	T get(String id);

	List<T> listAll();

	void insert(T entity);

	void delete(String id);

	void update(T entity);

}
