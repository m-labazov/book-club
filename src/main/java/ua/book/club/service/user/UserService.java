package ua.book.club.service.user;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import ua.book.club.dao.user.UserDao;
import ua.book.club.domain.user.User;
import ua.book.club.service.common.AbstractService;

public class UserService extends AbstractService<User, UserDao> implements
		UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException, DataAccessException {
		User user = getByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User with name '" + username
					+ "' doesn't exist.");
		}
		return user;
	}

	public User getByUsername(String username) {
		return dao.getByUsername(username);
	}

}
