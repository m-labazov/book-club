package ua.book.club.dao.user;

import ua.book.club.dao.common.AbstractDao;
import ua.book.club.domain.user.User;

public class UserDao extends AbstractDao<User> {

	public User getByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<User> getEntityClass() {
		return User.class;
	}

}
