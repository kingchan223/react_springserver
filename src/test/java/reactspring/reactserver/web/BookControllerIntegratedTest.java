package reactspring.reactserver.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.boot.test.context.SpringBootTest.*;


/*
::통합 테스트(컨트롤러로 전체 스프링 테스트 -> 모든 Bean들 메모리레 올리소 테스트)::
* WebEnvironment.MOCK -> 실제 톰캣을 올리는게 아니라, 다른 톰캣으로 테스트
* WebEnvironment.RANDOM_PORT -> 실제 우리의 톰캣으로 테스트
* @AutoConfigureMockMvc -> MockMvc를 ioc에 등록해준다.
* @Transactional -> 각각의 테스트메소드가 종료될 때마다 rollback해주는 어노테이션
*
*
 * */
@Transactional
@AutoConfigureMockMvc // MockMvc객체를 DI받기 위해 필요
@SpringBootTest(webEnvironment = WebEnvironment.MOCK)// --> 얘를 하면 모든 애들이 메모리에 뜬다.
public class BookControllerIntegratedTest {

    @Autowired
    private MockMvc mockMvc;
}
