package ua.book.club.dao.department;

import ua.book.club.dao.common.AbstractDao;
import ua.book.club.domain.department.Department;

public class DepartmentDao extends AbstractDao<Department> {

	@Override
	protected Class<Department> getEntityClass() {
		return Department.class;
	}

}
