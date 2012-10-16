package ua.book.club.dao.common;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import ua.book.club.dao.IDao;
import ua.book.club.domain.IIdentifiable;

@SuppressWarnings("unchecked")
public abstract class AbstractDao<T extends IIdentifiable> implements IDao<T> {

	private SessionFactory sessionFactory;

	protected abstract Class<T> getEntityClass();

	protected final Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public T get(long id) {
		T result = (T) getSession().createCriteria(getEntityClass())
				.add(Restrictions.eq("id", id)).uniqueResult();
		return result;
	}

	@Override
	public List<T> listAll() {
		List<T> result = getSession().createCriteria(getEntityClass()).list();
		return result;
	}

	public void insert(T entity) {
		update(entity, null);
	}

	@Override
	public void update(T entity, String entityName) {
		if (entity.isNew()) {
			getSession().save(entityName, entity);
		} else {
			Object merged = getSession().merge(entityName, entity);
			getSession().saveOrUpdate(entityName, merged);
		}
	}

	@Override
	public void delete(T entity) {
		getSession().delete(entity);
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
