package org;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class BookRepository {

	@ConfigProperty(name="book.genre",defaultValue="Sci-fi")
	String genre;

	public List<Book> getAllBooks() {
		return List.of(new Book(1, "Understanding Quarku", "Antoino", 2020, genre),
				new Book(2, "Practicing Quarku", "Antoino", 2020, genre),
				new Book(3, "Black book Java", "james", 2005, genre));
	}

	public Optional<Book> getBook(int id) {
		return getAllBooks().stream().filter(b -> b.id == id).findFirst();
	}

}
