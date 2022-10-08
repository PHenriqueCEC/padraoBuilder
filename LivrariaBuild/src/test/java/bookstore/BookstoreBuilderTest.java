package bookstore;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayNameGenerator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class BookstoreBuilderTest {

    private Date dataInvalida;
    private Date data;

    public BookstoreBuilderTest() {
        try {
            dataInvalida = new SimpleDateFormat("yyyy-MM-dd").parse("2023-04-29");
            data = new SimpleDateFormat("yyyy-MM-dd").parse("2022-07-24");
        } catch (ParseException e){}

}

    @Test
    public void deveRetornarAutorInvalido() {
        try {
            BookstoreBuilder bookstoreBuilder = new BookstoreBuilder();
            Bookstore bookstore = bookstoreBuilder
                    .setNumPaginas(350)
                    .setNomeAutor("")
                    .setAnoPublicacao(data)
                    .setIsbn("61665165-15")
                    .setEditora("novatec")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome do autor invalido!", e.getMessage());
        }
    }

    @Test
    public void deveRetornarNumeroPaginasInvalido() {
        try {
            BookstoreBuilder bookstoreBuilder = new BookstoreBuilder();
            Bookstore bookstore = bookstoreBuilder
                    .setNumPaginas(0)
                    .setNomeAutor("Pedro")
                    .setAnoPublicacao(data)
                    .setIsbn("61665165-15")
                    .setEditora("novatec")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numero de paginas invalido!", e.getMessage());
        }
    }

    @Test
    public void deveRetornarDataInvalida() {
        try {
            BookstoreBuilder bookstoreBuilder = new BookstoreBuilder();
            Bookstore bookstore = bookstoreBuilder
                    .setNumPaginas(10)
                    .setNomeAutor("Pedro")
                    .setAnoPublicacao(dataInvalida)
                    .setIsbn("61665165-15")
                    .setEditora("novatec")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data de lancamento invalida!", e.getMessage());
        }
    }

    @Test
    public void deveRetornarIsbnInvalido() {
        try {
            BookstoreBuilder bookstoreBuilder = new BookstoreBuilder();
            Bookstore bookstore = bookstoreBuilder
                    .setNumPaginas(105)
                    .setNomeAutor("Pedro")
                    .setAnoPublicacao(data)
                    .setIsbn("")
                    .setEditora("novatec")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("ISBN invalido!", e.getMessage());
        }
    }

    @Test
    public void deveRetornarEditoraInvalida() {
        try {
            BookstoreBuilder bookstoreBuilder = new BookstoreBuilder();
            Bookstore bookstore = bookstoreBuilder
                    .setNumPaginas(10)
                    .setNomeAutor("Pedro")
                    .setAnoPublicacao(data)
                    .setIsbn("61665165-15")
                    .setEditora("")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome da editora invalido!", e.getMessage());
        }
    }


}
