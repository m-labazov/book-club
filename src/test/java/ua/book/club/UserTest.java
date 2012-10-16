package ua.book.club;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;

import ua.book.club.domain.user.User;
import ua.book.club.service.user.UserService;

public class UserTest extends AbstractTest<User, UserService> {

	@Autowired
	UserService userService;

	@Override
	protected UserService getService() {
		return userService;
	}

	@Override
	protected User getEntity() {
		User user = new User();
		user.setFio("Michael Carlson");
		user.setPassword("abcdef");
		return user;
	}

	@Override
	protected void compareEntities(User entity, User result) {
		assertNotNull(entity);
		assertNotNull(result);
		assertEquals(entity.getFio(), result.getFio());
		assertEquals(entity.getPassword(), result.getPassword());
	}

}
