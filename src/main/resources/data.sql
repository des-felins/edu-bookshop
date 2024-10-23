INSERT INTO formats(id, name) VALUES (1, 'Paperback');
INSERT INTO formats(id, name) VALUES (2, 'Hardcover');

INSERT INTO categories(id, name) VALUES (1, 'Fiction');
INSERT INTO categories(id, name) VALUES (2, 'Nonfiction');
INSERT INTO categories(id, name) VALUES (3, 'Travel');

INSERT INTO authors(id, name) VALUES (1, 'Herman Hesse');
INSERT INTO authors(id, name) VALUES (2, 'Oscar Wilde');
INSERT INTO authors(id, name) VALUES (3, 'William Shakespeare');
INSERT INTO authors(id, name) VALUES (4, 'Richard Dawkins');
INSERT INTO authors(id, name) VALUES (5, 'Tom Turcich');
INSERT INTO authors(id, name) VALUES (6, 'James Joyce');
INSERT INTO authors(id, name) VALUES (7, 'Thomas Wolfe');

INSERT INTO languages(id, name) VALUES (1, 'English');
INSERT INTO languages(id, name) VALUES (2, 'German');

INSERT INTO books(id, name, category_id, author_id, language_id, quantity, format_id, price, isbn) VALUES (1, 'Der Steppenwolf', 1, 1, 2, 33, 2, 28.01, '978-3518366752');
INSERT INTO books(id, name, category_id, author_id, language_id, quantity, format_id, price, isbn) VALUES (2, 'Demian', 1, 1, 2, 10, 1, 12.6, '988-3518366756');
INSERT INTO books(id, name, category_id, author_id, language_id, quantity, format_id, price, isbn) VALUES (3, 'Das Glasperlenspiel', 1, 1, 2, 21, 2, 30.0, '970-3518366751');
INSERT INTO books(id, name, category_id, author_id, language_id, quantity, format_id, price, isbn) VALUES (4, 'Plays, Prose Writings and Poems', 1, 2, 1, 44, 2, 55.8, '978-0679405832');
INSERT INTO books(id, name, category_id, author_id, language_id, quantity, format_id, price, isbn) VALUES (5, 'The Picture of Dorian Gray', 1, 2, 1, 22, 2, 20.0, '978-0679405838');
INSERT INTO books(id, name, category_id, author_id, language_id, quantity, format_id, price, isbn) VALUES (6, 'Hamlet', 1, 3, 1, 54, 1, 12.0, '978-0679405811');
INSERT INTO books(id, name, category_id, author_id, language_id, quantity, format_id, price, isbn) VALUES (7, 'Complete Sonnets', 1, 3, 1, 12, 1, 13.7, '978-0679305838');
INSERT INTO books(id, name, category_id, author_id, language_id, quantity, format_id, price, isbn) VALUES (8, 'Romeo and Juliet', 1, 3, 1, 43, 1, 11.7, '978-1679305838');
INSERT INTO books(id, name, category_id, author_id, language_id, quantity, format_id, price, isbn) VALUES (9, 'The God Delusion', 2, 4, 1, 1, 2, 43.6, '978-1710779022');
INSERT INTO books(id, name, category_id, author_id, language_id, quantity, format_id, price, isbn) VALUES (10, 'The Selfish Gene', 2, 4, 1, 43, 2, 35.54, '978-1710779016');
INSERT INTO books(id, name, category_id, author_id, language_id, quantity, format_id, price, isbn) VALUES (11, 'The World Walk', 3, 5, 1, 12, 2, 20.16, '978-1510779013');
INSERT INTO books(id, name, category_id, author_id, language_id, quantity, format_id, price, isbn) VALUES (12, 'A Portrait of the Artist as a Young Man', 1, 6, 1, 4, 1, 17.0, '978-0679408811');
INSERT INTO books(id, name, category_id, author_id, language_id, quantity, format_id, price, isbn) VALUES (13, 'Ulysses', 1, 6, 1, 7, 2, 57.0, '978-0888408811');
INSERT INTO books(id, name, category_id, author_id, language_id, quantity, format_id, price, isbn) VALUES (14, 'Look Homeward, Angel', 1, 7, 1, 31, 2, 60.0, '978-0888468811');
INSERT INTO books(id, name, category_id, author_id, language_id, quantity, format_id, price, isbn) VALUES (15, 'Of Time and River', 1, 7, 1, 11, 2, 59.1, '978-0888468822');



