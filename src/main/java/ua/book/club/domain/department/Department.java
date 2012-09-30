package ua.book.club.domain.department;

import ua.book.club.domain.common.Identifier;

public class Department extends Identifier {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
