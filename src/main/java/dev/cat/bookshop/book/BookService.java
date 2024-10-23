package dev.cat.bookshop.book;

import dev.cat.bookshop.book.model.Book;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAllFiltered(String categoryName,
                                      String languageName,
                                      String formatName,
                                      int maxPrice) {

        Specification<Book> spec = Specification.where(null);

        if (categoryName != null) {
            spec = spec.and(BookSpecification.hasCategoryName(categoryName));
        }

        if (languageName != null) {
            spec = spec.and(BookSpecification.hasLanguageName(languageName));
        }

        if (formatName != null) {
            spec = spec.and(BookSpecification.hasFormatName(formatName));
        }

        if (maxPrice > 0) {
            spec = spec.and(BookSpecification.hasPriceLessThanOrEqualTo(maxPrice));
        }

        return bookRepository.findAll(spec);
    }


}
