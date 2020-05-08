package com.vien.springboot.book.Controller;


import com.vien.springboot.book.Entity.SqlBook;
import com.vien.springboot.book.Service.SqlBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class SQLBookController {
@Autowired
SqlBookService sqlBookService;
    @GetMapping("list-book")
    public  String getListBook(Model model)
    {
        model.addAttribute("books",sqlBookService.findAll());
    return  "book/list-book";
}
 @GetMapping("managerBook")
    public String ManagerBook(Model model){
     model.addAttribute("books",sqlBookService.findAll());
        return "admin/managerBook";
    }
    @GetMapping("showFormForAdd")
    public String showFormForAdd(Model model){
        SqlBook sqlBook=new SqlBook();
        model.addAttribute("books",sqlBook);
        return "upload/upload";
    }
    @GetMapping("showFormForUpdate")
    public String showFormForUpdate(@RequestParam("BookId") int ID,
                                    Model model){
        SqlBook sqlBook=sqlBookService.getbook(ID);
        model.addAttribute("books",sqlBook);
        return "upload/upload";
    }


    @GetMapping("DeleteBook")
    public String DeleteBook(@RequestParam("BookId") int ID,
                             Model model){
    sqlBookService.deleteBook(ID);
        return "redirect:/managerBook";
    }
}
