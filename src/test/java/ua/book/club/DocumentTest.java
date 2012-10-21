package ua.book.club;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;

import ua.book.club.domain.document.Document;
import ua.book.club.domain.user.User;
import ua.book.club.service.document.DocumentService;
import ua.book.club.service.user.UserService;

public class DocumentTest extends AbstractTest<Document, DocumentService> {

	@Autowired
	private DocumentService documentService;

	@Autowired
	private UserService userService;

	@Override
	protected DocumentService getService() {
		return documentService;
	}

	@Override
	protected Document getEntity() {
		Document newDocument = TestUtil.newDocument();

		User user = newDocument.getExecutor();
		userService.insert(user);

		return newDocument;
	}

	@Override
	protected void compareEntities(Document entity, Document result) {
		assertNotNull(entity);
		assertNotNull(result);
		assertEquals(entity.getName(), result.getName());
		assertEquals(entity.getPublishDate(), result.getPublishDate());
		assertEquals(entity.getExecutor().getId(), result.getExecutor().getId());
	}

}
