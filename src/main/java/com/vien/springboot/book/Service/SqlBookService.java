package com.vien.springboot.book.Service;

import com.vien.springboot.book.Dao.SqlBookDao;
import com.vien.springboot.book.Entity.SqlBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
public class SqlBookService {
    @Autowired
    SqlBookDao sqlBookDao;

    @Transactional
    public List<SqlBook> findAll(){
        List<SqlBook> books=sqlBookDao.findAll();
        return books;
    }

    @Transactional
    public void savebook(SqlBook sqlBook){
        sqlBookDao.addbook(sqlBook);
    }
    @Transactional
    public SqlBook getbook(int id){
        return sqlBookDao.findBook(id);
    }
@Transactional
    public void deleteBook(int id) {
        sqlBookDao.deleteBook(id);
    }
}
