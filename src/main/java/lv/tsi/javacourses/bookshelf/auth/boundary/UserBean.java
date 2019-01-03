package lv.tsi.javacourses.bookshelf.auth.boundary;

import lv.tsi.javacourses.bookshelf.auth.model.UserEntity;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

@Named
@RequestScoped
public class UserBean implements Serializable {

    public void doSearch() {

        System.out.println("Users ...");
    }

    @PersistenceContext
    private EntityManager em;
     public List<UserEntity> getUsers() {
            return em.createQuery("select u from User u", UserEntity.class).getResultList();

    }
}
