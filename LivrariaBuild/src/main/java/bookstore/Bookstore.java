package bookstore;

import java.util.Date;

public class Bookstore {

   private String nomeAutor;
   private String editora;
   private Date anoPublicacao;
   private String isbn;
   private int numPaginas;

   public Bookstore() {
      this.nomeAutor = "";
      this.editora = "";
      this.anoPublicacao = null;
      this.isbn = "";
      this.numPaginas = 0;
   }

   public String getNomeAutor() { return this.nomeAutor; }
   public void setNomeAutor(String nomeAutor ) { this.nomeAutor = nomeAutor; }

   public String getEditora() { return this.editora; }
   public void setEditora(String editora) { this.editora = editora; }

   public Date getAnoPublicacao() { return this.anoPublicacao; }
   public void setAnoPublicacao(Date anoPublicacao) { this.anoPublicacao = anoPublicacao; }

   public String getIsbn() { return this.isbn; }
   public void setIsbn(String isbn) { this.isbn = isbn; }

   public int getNumPaginas() { return this.numPaginas; }
   public void setNumPaginas(int numPaginas) { this.numPaginas = numPaginas; }

}