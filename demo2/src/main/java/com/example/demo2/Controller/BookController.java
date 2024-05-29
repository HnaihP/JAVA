package com.example.demo2.Controller;

import com.example.demo2.Model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    private List<Book> listBook = new ArrayList<>(Arrays.asList(
            new Book(1, "Lập trình Windows", "Nguyễn Huy Cường", 99999),
            new Book(2, "Lập trình Web", "Nguyễn Huy Cường", 12345),
            new Book(3, "Lập trình ứng dụng Java", "Nguyễn Huy Cường", 454534),
            new Book(4, "Lập trình Windows", "Nguyễn Huy Cường", 848593)
    ));
    @GetMapping("/books")
    public List<Book> getAll()
    {
        return listBook;
    }
    @GetMapping("/books/{id}")
    public Book get(@PathVariable int id)
    {
        var findBook = listBook.stream().filter(p->p.getId()== id).findFirst().orElse(null);
        if(findBook == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return findBook;
    }
    @PostMapping("/books")
    public Book create (@RequestBody Book book)
    {
        var maxId = listBook
                .stream()
                .mapToInt(v -> v.getId())
                .max().orElse( 0);
        book.setId(maxId +1);
        listBook.add(book);
        return book;
    }
    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable int id) {
        var findBook = listBook.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
        if (findBook == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        listBook.remove(findBook);
    }
    @GetMapping(value = "/")
    public String welcome() {
        return "Welcome to Book Store";
    }
}
