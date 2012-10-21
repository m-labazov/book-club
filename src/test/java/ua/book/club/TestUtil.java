package ua.book.club;

import java.util.Date;

import ua.book.club.domain.department.Department;
import ua.book.club.domain.document.Document;
import ua.book.club.domain.user.User;

public class TestUtil {

	public static User newUser() {
		User user = new User();
		user.setFio("Michael Carlson");
		user.setPassword("abcdef");
		user.getRoles();
		return user;
	}

	public static Document newDocument() {
		Document document = new Document();
		document.setName("Oceння вычетка");
		document.setPublishDate(new Date());
		document.setExecutor(newUser());
		return document;
	}

	public static Department newDepartment() {
		Department department = new Department();
		department.setName("IT отдел");
		return department;
	}

}
