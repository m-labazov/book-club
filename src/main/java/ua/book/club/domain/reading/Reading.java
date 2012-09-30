package ua.book.club.domain.reading;

import java.util.Date;

import ua.book.club.domain.common.Identifier;
import ua.book.club.domain.department.Department;

public class Reading extends Identifier {

	private Date readingDate;
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
	
}
