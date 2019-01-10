package lv.tsi.javacourses.bookshelf.books.model;

import lv.tsi.javacourses.bookshelf.auth.model.UserEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity (name = "Reservation")
@Table(name = "reservations")
public class ReservationEntity implements Serializable {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private BookEntity book;

    @ManyToOne
    private UserEntity user;
    @Column
    private ReservationStatus status;
    @Column
    private LocalDateTime created;

    @PrePersist
    public void onCreated(){
        created = LocalDateTime.now();
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BookEntity getBook() {
        return book;
    }

    public void setBook(BookEntity book) {
        this.book = book;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
