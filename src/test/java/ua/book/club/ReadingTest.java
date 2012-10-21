package ua.book.club;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import ua.book.club.domain.department.Department;
import ua.book.club.domain.document.Document;
import ua.book.club.domain.reading.Reading;
import ua.book.club.service.department.DepartmentService;
import ua.book.club.service.document.DocumentService;
import ua.book.club.service.reading.ReadingService;
import ua.book.club.service.user.UserService;

public class ReadingTest extends AbstractTest<Reading, ReadingService> {

	@Autowired
	private ReadingService readingService;

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private DocumentService documentService;

	@Autowired
	private UserService userService;

	@Override
	protected ReadingService getService() {
		return readingService;
	}

	@Override
	protected Reading getEntity() {
		Document newDocument = TestUtil.newDocument();
		userService.insert(newDocument.getExecutor());
		documentService.insert(newDocument);

		Department newDepartment = TestUtil.newDepartment();
		departmentService.insert(newDepartment);

		Reading reading = new Reading();
		reading.setReadingDate(new Date());
		reading.setDepartment(newDepartment);
		reading.setDocument(newDocument);
		return reading;
	}

	@Override
	protected void compareEntities(Reading entity, Reading result) {
		// TODO Auto-generated method stub

	}

}
