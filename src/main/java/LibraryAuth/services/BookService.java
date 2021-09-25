package LibraryAuth.services;

import LibraryAuth.model.Libro;

import java.util.List;

public interface BookService {
    List<Libro> getAllBooks();
    Libro getBookByISBN(String isbn);
    List<Libro> getLibriByAnno(Integer anno);
    List<Libro> getLibriByAutore(String autore);
    Libro getLibro(String autore, String titolo);
    void saveLibro(Libro libro);
    void updateLibro(Libro libro);
    void deleteLibro(String isbn);
}
