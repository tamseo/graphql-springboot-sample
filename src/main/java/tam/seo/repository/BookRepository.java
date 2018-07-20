package tam.seo.repository;

import tam.seo.model.Author;
import tam.seo.model.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookRepository {

    public Iterable<Book> findAll() {
        List<Book> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Book("Java: The Complete Reference","1259589331",1344,new Author("Gosling","James")));
        }
        return list;
    }

    public long count() {
        return 0;
    }

    public void save(Book book) {
        System.out.println(book.getTitle() + "was saved!");
    }

    public void delete(Long id) {
        System.out.println("bookid " +id+ " was delete!");
    }

    public Book findOne(Long id) {
        return new Book("Java: The Complete Reference","1259589331",1344,new Author("Gosling","James"));
    }
}
