package ua.book.club.dict;

public enum Roles {

	EXECUTOR("Исполнитель"), COORDINATOR("Координатор"), ADMINISTRATOR(
			"Администратор");

	private String name;

	private Roles(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
