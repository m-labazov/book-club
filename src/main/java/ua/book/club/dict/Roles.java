package ua.book.club.dict;

public enum Roles {

	EXECUTOR("�����������"), COORDINATOR("�����������"), ADMINISTRATOR(
			"�������������");

	private String name;

	private Roles(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
