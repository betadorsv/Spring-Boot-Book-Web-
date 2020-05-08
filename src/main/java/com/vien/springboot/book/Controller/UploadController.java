package com.vien.springboot.book.Controller;

import com.vien.springboot.book.Entity.SqlBook;
import com.vien.springboot.book.Service.FileService;
import com.vien.springboot.book.Service.SqlBookService;
import org.apache.tomcat.jni.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.ServletContext;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@Controller
public class UploadController {

 //   @GetMapping("/upload")
  //  public String upload(Model model) {
   //     model.addAttribute("book", new SqlBook());
  //      return "upload/upload";
//    }

    @Autowired
    SqlBookService sqlBookService;


    @Autowired
    ServletContext servletContext;
    @RequestMapping("saveBook")
    public  String UploadFile(Model model, @ModelAttribute SqlBook sqlBook,
                              @RequestParam("photo_file") MultipartFile book_cover,
                              @RequestParam("content_file") MultipartFile content_file

    ){
        StringBuilder stringBuilder=new StringBuilder();
        String photo_folder=servletContext.getRealPath("/")+"/FileUpload/image/";
        String content_folder=servletContext.getRealPath("/")+"FileUpload/content/";
        if(book_cover.isEmpty()|| content_file.isEmpty()){
            model.addAttribute("message","vui long chon file");
            System.out.println("khong co file");
        }
        else {
            try{
                Path photo_path=Paths.get(photo_folder+book_cover.getOriginalFilename());
                Path content_path=Paths.get(content_folder+content_file.getOriginalFilename());
                System.out.println("book cover" +photo_path.toString());
                System.out.println("book cover" +content_path.toString());
                Files.write(photo_path,book_cover.getBytes());
                Files.write(content_path,content_file.getBytes());
                String photo_name=book_cover.getOriginalFilename();
                String content_name=content_file.getOriginalFilename();
                sqlBook.setBook_cover(photo_name);
                sqlBook.setBook_content(content_name);
                sqlBookService.savebook(sqlBook);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("loi cmnr");
            }
        }

        return "redirect:/managerBook";
    }
}


