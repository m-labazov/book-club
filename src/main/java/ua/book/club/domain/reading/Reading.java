package ua.book.club.domain.reading;

import java.util.Date;

import ua.book.club.domain.common.Identifier;
import ua.book.club.domain.department.Department;
import ua.book.club.domain.document.Document;

public class Reading extends Identifier {

	private Date readingDate;
	private Document document;
	private Department department;

	public Date getReadingDate() {
		return readingDate;
	}

	public void setReadingDate(Date readingDate) {
		this.readingDate = readingDate;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

}
