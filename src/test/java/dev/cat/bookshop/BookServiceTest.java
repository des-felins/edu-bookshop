package dev.cat.bookshop;

import dev.cat.bookshop.book.BookService;
import dev.cat.bookshop.book.model.Book;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.test.context.jdbc.Sql;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Testcontainers
@Sql(scripts = {"classpath:schema.sql", "classpath:data.sql"})
class BookServiceTest {

    @Container
    @ServiceConnection
    static PostgreSQLContainer<?> postgresContainer =
            new PostgreSQLContainer<>(DockerImageName.parse("postgres:latest"));

    @BeforeAll
    static void beforeAll() {
        postgresContainer.start();
    }

    @AfterAll
    static void afterAll() {
        postgresContainer.stop();
    }

    @Autowired
    BookService bookService;

    @LocalServerPort
    private Integer port;

    @Test
    void findAllBookByCategory() {
        List<Book> books = bookService.findAllFiltered(
                "Nonfiction", null, null, 0);
        int expected = 2;
        Assertions.assertEquals(expected, books.size());
    }

    @Test
    void findAllBookByCategoryAndFormat() {
        List<Book> books = bookService.findAllFiltered(
                "Fiction", null, "Hardcover", 0);
        int expected = 7;
        Assertions.assertEquals(expected, books.size());
    }

    @Test
    void findAllBookByCategoryAndLanguage() {
        List<Book> books = bookService.findAllFiltered(
                "Fiction", "German", null, 0);
        int expected = 3;
        Assertions.assertEquals(expected, books.size());
    }


    @Test
    void findAllBookByCategoryAndLanguageAndFormat() {
        List<Book> books = bookService.findAllFiltered(
                "Fiction", "German", "Hardcover", 0);
        int expected = 2;
        Assertions.assertEquals(expected, books.size());
    }

    @Test
    void findAllBookByCategoryAndLanguageAndFormatAndPrice() {
        List<Book> books = bookService.findAllFiltered(
                "Fiction", "German", "Hardcover", 29);
        int expected = 1;
        Assertions.assertEquals(expected, books.size());
    }

    @Test
    void ShouldNotFindAnyIfNoMatches() {
        List<Book> books = bookService.findAllFiltered(
                "Fiction", "German", "Hardcover", 10);
        int expected = 0;
        Assertions.assertEquals(expected, books.size());
    }

    @Test
    void ShouldNotFindAllIfNoFilters() {
        List<Book> books = bookService.findAllFiltered(
                null, null, null, 0);
        int expected = 15;
        Assertions.assertEquals(expected, books.size());
    }


}
