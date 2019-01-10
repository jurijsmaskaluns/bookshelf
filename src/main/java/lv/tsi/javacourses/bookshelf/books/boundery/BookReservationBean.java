package lv.tsi.javacourses.bookshelf.books.boundery;

import lv.tsi.javacourses.bookshelf.auth.boundary.CurrentUser;
import lv.tsi.javacourses.bookshelf.books.model.BookEntity;
import lv.tsi.javacourses.bookshelf.books.model.ReservationEntity;
import lv.tsi.javacourses.bookshelf.books.model.ReservationStatus;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.awt.print.Book;
import java.util.List;

@Stateless
@Named
public class BookReservationBean {
    @PersistenceContext
    private EntityManager em;

    @Inject
    private CurrentUser currentUser;

    public void reserve(Long id){
        System.out.println("trying to reserve a book id: " + id + " for user id: " + currentUser.getUser().getId());

        BookEntity book = em.find(BookEntity.class, id); //nahodim knigu po id

        ReservationEntity reservation = new ReservationEntity(); //novaja rezervacija, obi4nij objekt

        reservation.setBook(book);
        reservation.setUser(currentUser.getUser()); // poljzovatelj kotorij zaloginilsja
        reservation.setStatus(ReservationStatus.ACTIVE);

        em.persist(reservation); // sohranili bazu dannih (kniga, poljzovatelj, status rezervacii)
    }

    public List<ReservationEntity> getReservations(){
     return em.createQuery("select r from Reservation r", ReservationEntity.class).getResultList();
    }
}
