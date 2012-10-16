package ua.book.club.dao.document;

import ua.book.club.dao.common.AbstractDao;
import ua.book.club.domain.document.Document;

public class DocumentDao extends AbstractDao<Document> {

	@Override
	protected Class<Document> getEntityClass() {
		return Document.class;
	}

}
