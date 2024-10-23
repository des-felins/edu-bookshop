package dev.cat.bookshop.book;

import dev.cat.bookshop.book.model.Book;
import org.springframework.data.jpa.domain.Specification;

public class BookSpecification {

    public static Specification<Book> hasCategoryName(String name) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root
                        .get("category")
                        .get("name"), name);
    }


    public static Specification<Book> hasPriceLessThanOrEqualTo(int price) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.lessThanOrEqualTo(root.get("price"), price);
    }



    public static Specification<Book> hasLanguageName(String name) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root
                        .get("language")
                        .get("name"), name);
    }

    public static Specification<Book> hasFormatName(String name) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root
                        .get("format")
                        .get("name"), name);
    }

}
