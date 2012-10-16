package ua.book.club;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import ua.book.club.domain.IIdentifiable;
import ua.book.club.service.IService;

@ContextConfiguration(locations = { "classpath:/application.xml",
		"classpath:/hibernate-config.xml", "classpath:/book-club-context.xml" })
public abstract class AbstractTest<E extends IIdentifiable, S extends IService<E>>
		extends AbstractTransactionalJUnit4SpringContextTests {

	protected abstract S getService();

	protected abstract E getEntity();

	protected abstract void compareEntities(E entity, E result);

	@Test
	public void insertTest() {
		E entity = getEntity();
		S service = getService();

		service.insert(entity);

		E result = service.get(entity.getId());

		compareEntities(entity, result);
	}

}
