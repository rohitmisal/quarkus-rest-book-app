package org;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.logging.Logger;

@Path("/api/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

	@Inject
	BookRepository bookRepo;

	@Inject
	Logger logger;
	
	@GET
	public List<Book> getAllBooks() {
		logger.info("return All Books");
		return bookRepo.getAllBooks();
	}

	@GET
	@Path("/count")
	@Produces(MediaType.TEXT_PLAIN)
	public int countAllBooks() {
		logger.info("return no of Books");

		return bookRepo.getAllBooks().size();
	}

	@GET
	@Path("{id}")
	public Optional<Book> getBook(@PathParam("id") int id) {
		logger.info("return single  Books with id :"+ id);
		return bookRepo.getBook(id);
	}

}