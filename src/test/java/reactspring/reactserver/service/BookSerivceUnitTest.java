package reactspring.reactserver.service;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import reactspring.reactserver.domain.BookRepository;


/*
* ::단위 테스트(service에 관련된 애들만 메모리에 띄운다.)::
* BookRepository를 가짜 객체로 만든다.
*
* */

@ExtendWith(MockitoExtension.class)
public class BookSerivceUnitTest {

    @InjectMocks//-->BookService객체가 만들어징 때, 해당 파일에 @Mock로 등록된 모든 애들을 주입 받는다.
    private BookService bookService;

    private BookRepository bookRepository;
}
