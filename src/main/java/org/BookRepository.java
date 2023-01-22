package org;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BookRepository {

	public List<Book> getAllBooks(){
		return List.of(new Book(1, "Understanding Quarku", "Antoino", 2020, "IT"),
				new Book(2, "Practicing Quarku", "Antoino", 2020, "IT"),
				new Book(3,"Black book Java","james",2005,"IT")
        		);
	}

	public Optional<Book> getBook(int id) {
		return getAllBooks().stream().filter(b->b.id==id).findFirst();
	}
	
}
