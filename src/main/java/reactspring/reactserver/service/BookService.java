package reactspring.reactserver.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactspring.reactserver.domain.Book;
import reactspring.reactserver.domain.BookRepository;


import java.util.List;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;

    @Transactional
    public Book save(Book book){
        return bookRepository.save(book);
    }

    public Book findById(Long id){
        return bookRepository.findById(id).orElseThrow(()->new IllegalArgumentException("id를 확인해주세요."));
    }

    public List<Book> findAll(){
        return bookRepository.findAll();
    }
    @Transactional
    public Book edit(Long id, Book changedbook){
        Book book = bookRepository.findById(id).orElseThrow(()->new IllegalArgumentException("id를 확인해주세요."));
        book.setTitle(changedbook.getTitle());
        book.setTitle(changedbook.getTitle());
        return book;
    }
    @Transactional
    public String delete(Long id){
        bookRepository.deleteById(id);
        return "ok";
    }
}
