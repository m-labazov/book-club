package ua.book.club.domain.common;

import ua.book.club.domain.IIdentifiable;

public class Identifier implements IIdentifiable {

	private long id;
	
	@Override
	public long getId() {
		return id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
	}
	
}
