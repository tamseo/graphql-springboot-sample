package tam.seo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import tam.seo.model.Author;
import tam.seo.model.Book;
import tam.seo.repository.AuthorRepository;
import tam.seo.repository.BookRepository;

public class Query implements GraphQLQueryResolver {

    private BookRepository bookRepository;

    private AuthorRepository authorRepository;

    public Query(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public Long countBooks() {
        return bookRepository.count();
    }

    public Long countAuthors() {
        return authorRepository.count();
    }
}
