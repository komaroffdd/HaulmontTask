ALTER TABLE book ADD CONSTRAINT fk_author_id FOREIGN KEY (author) REFERENCES author(id);
ALTER TABLE book ADD CONSTRAINT fk_genre_id FOREIGN KEY (genre) REFERENCES genre(id);
