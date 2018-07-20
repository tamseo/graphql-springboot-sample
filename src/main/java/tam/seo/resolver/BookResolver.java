package tam.seo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import tam.seo.model.Author;
import tam.seo.model.Book;
import tam.seo.repository.AuthorRepository;

public class BookResolver implements GraphQLResolver<Book> {

    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.findOne(book.getAuthor().getId());
    }
}
