package ua.book.club.domain.common;

import ua.book.club.domain.IIdentifiable;

public class Identifier implements IIdentifiable {

	private long id = -1;

	@Override
	public long getId() {
		return id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public boolean isNew() {
		return id == -1 ? true : false;
	}
}
