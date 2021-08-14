package reactspring.reactserver.web;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;


//단위 테스트 (컨트롤러만 테스트 -> 컨트롤러 관련 로직만 ex:필터, 컴트롤러, controllerAdvice)

@WebMvcTest // -> 메모리에 컨트롤러, 필터, controllerAdvice만 뜬다.
//@ExtendWith(SpringExtension.class) 얘가 있으면 스프링과 연계하여 테스트진행 (@WebMvcTest는 이미 이 어노테이션을 들고 있음)
public class BookControllerUnitTest {
}
