package com.vien.springboot.book.Dao;

import com.vien.springboot.book.Entity.SqlBook;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class SqlBookDao {
    @Autowired
    private EntityManager entityManager;
    public List<SqlBook> findAll(){
      Session session=entityManager.unwrap(Session.class);
      Query query=session.createQuery("from SqlBook");
       List<SqlBook> books=query.getResultList();
        return books;
    }


    public void addbook(SqlBook sqlBook){
   Session session = entityManager.unwrap(Session.class);

        session.saveOrUpdate(sqlBook);
}

public SqlBook findBook(int id){
        Session session=entityManager.unwrap(Session.class);
        Query<SqlBook> query=session.createQuery("from  SqlBook  where id=:id");
query.setParameter("id",id);
SqlBook sqlBook=query.getSingleResult();
return sqlBook;
}

    public void deleteBook(int id) {
        Session session = entityManager.unwrap(Session.class);

        Query<SqlBook> query=session.createQuery("delete from SqlBook where id=:id");
        query.setParameter("id",id);
        query.executeUpdate();
    }
}
