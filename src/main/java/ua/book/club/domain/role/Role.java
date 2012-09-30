package ua.book.club.domain.role;

import ua.book.club.domain.common.Identifier;

public class Role extends Identifier {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
