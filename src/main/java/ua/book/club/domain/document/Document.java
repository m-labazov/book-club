package ua.book.club.domain.document;

import java.util.Date;
import java.util.List;

import ua.book.club.domain.common.Identifier;
import ua.book.club.domain.reading.Reading;
import ua.book.club.domain.user.User;

public class Document extends Identifier {

	private String name;
	private Date publishDate;
	private User executor;
	private List<Reading> readeings;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public User getExecutor() {
		return executor;
	}
	public void setExecutor(User executor) {
		this.executor = executor;
	}
	public List<Reading> getReadeings() {
		return readeings;
	}
	public void setReadeings(List<Reading> readeings) {
		this.readeings = readeings;
	}
	
}
