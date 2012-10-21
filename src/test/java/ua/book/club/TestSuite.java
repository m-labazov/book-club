package ua.book.club;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ UserTest.class, DepartmentTest.class, DocumentTest.class,
		ReadingTest.class })
public class TestSuite {

}
