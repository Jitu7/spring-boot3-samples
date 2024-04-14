package com.example.jdbcclient.web;

import com.example.jdbcclient.domain.Bookmark;
import com.example.jdbcclient.domain.BookmarkJdbcClientRepository;
import com.example.jdbcclient.domain.BookmarkRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
public class BookmarkRestController {

    private final BookmarkRepository bookmarkRepository;
    private final BookmarkJdbcClientRepository bookmarkJdbcClientRepository;

    public BookmarkRestController(BookmarkRepository bookmarkRepository, BookmarkJdbcClientRepository bookmarkJdbcClientRepository) {
        this.bookmarkRepository = bookmarkRepository;
        this.bookmarkJdbcClientRepository = bookmarkJdbcClientRepository;
    }

    @GetMapping
    public List<Bookmark> findAll() {
//        return bookmarkRepository.findAll();
        return bookmarkJdbcClientRepository.findAll();
    }

}
