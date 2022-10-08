package bookstore;

import java.util.Date;
import java.util.Calendar;

public class BookstoreBuilder {

    private  Bookstore bookstore;
    private Calendar calendar;

    public BookstoreBuilder() {
        bookstore = new Bookstore();
        calendar = Calendar.getInstance();
    }

    public Bookstore build() {
        if(bookstore.getIsbn().equals("")) {
            throw new IllegalArgumentException("ISBN invalido!");
        }

        if(bookstore.getEditora().equals("")) {
            throw new IllegalArgumentException("Nome da editora invalido!");
        }

        if(bookstore.getAnoPublicacao().after(calendar.getTime())) {
            throw new IllegalArgumentException("Data de lancamento invalida!");
        }

        if(bookstore.getNomeAutor().equals("")) {
            throw new IllegalArgumentException("Nome do autor invalido!");
        }

        if(bookstore.getNumPaginas() < 1) {
            throw new IllegalArgumentException("Numero de paginas invalido!");
        }

        return bookstore;
    }

    public BookstoreBuilder setIsbn(String isbn) {
        bookstore.setIsbn(isbn);
        return this;
    }

    public BookstoreBuilder setEditora(String editora) {
        bookstore.setEditora(editora);
        return this;
    }

    public BookstoreBuilder setAnoPublicacao(Date anoPublicacao) {
        bookstore.setAnoPublicacao(anoPublicacao);
        return this;
    }

    public BookstoreBuilder setNomeAutor(String nomeAutor) {
        bookstore.setNomeAutor(nomeAutor);
        return this;
    }

    public BookstoreBuilder setNumPaginas(int numPaginas) {
        bookstore.setNumPaginas(numPaginas);
        return this;
    }




}
