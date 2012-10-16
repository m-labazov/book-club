package ua.book.club.dao.reading;

import ua.book.club.dao.common.AbstractDao;
import ua.book.club.domain.reading.Reading;

public class ReadingDao extends AbstractDao<Reading> {

	@Override
	protected Class<Reading> getEntityClass() {
		return Reading.class;
	}

}
