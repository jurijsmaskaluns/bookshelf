package lv.tsi.javacourses.bookshelf.books.boundery;

import lv.tsi.javacourses.bookshelf.books.model.BookEntity;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.io.Serializable;

@ViewScoped //informacija zivjot do teh por poka naho#usj na stranice
@Named
public class CreateBookBean implements Serializable {
    @PersistenceContext
    private EntityManager em;
    private BookEntity book = new BookEntity();
    private boolean created = false;
    @Transactional //metod dolzen bitj pome4en, 4tobi bila tranzakcija
    public String createBook(){
        em.persist(book);  //insert v bazu dannih
        book = new BookEntity();
        //return "book-created.xhtml";
        created = true;
        return null;
    }

    public boolean isCreated() {
        return created;
    }

    public BookEntity getBook() {
        return book;
    }

    public void setBook(BookEntity book) {
        this.book = book;
    }
}
