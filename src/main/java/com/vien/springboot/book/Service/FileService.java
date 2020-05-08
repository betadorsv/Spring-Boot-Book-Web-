package com.vien.springboot.book.Service;


import com.vien.springboot.book.Dao.SqlBookDao;
import com.vien.springboot.book.Entity.SqlBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.transaction.Transactional;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
@Transactional
public class FileService {

    @Autowired
    ServletContext servletContext;
    private  final SqlBookDao sqlBookDao;

    public FileService(SqlBookDao sqlBookDao) {
        this.sqlBookDao = sqlBookDao;
    }

    public String SaveImage(MultipartFile file) throws Exception{
        String folder=servletContext.getRealPath("/")+"/upload/img/coverbooks";
        byte[] bytes=file.getBytes();
        Path path= Paths.get(folder+file.getOriginalFilename());
        Files.write(path,bytes);
        return path.toString();
    }

    public  void saveBook(SqlBook sqlBook){

    }
}
