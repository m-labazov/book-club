package ua.book.club;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;

import ua.book.club.domain.department.Department;
import ua.book.club.service.department.DepartmentService;

public class DepartmentTest extends AbstractTest<Department, DepartmentService> {

	@Autowired
	private DepartmentService departmentService;

	@Override
	protected DepartmentService getService() {
		return departmentService;
	}

	@Override
	protected Department getEntity() {
		return TestUtil.newDepartment();
	}

	@Override
	protected void compareEntities(Department entity, Department result) {
		assertNotNull(entity);
		assertNotNull(result);
		assertEquals(entity.getName(), result.getName());
	}

}
