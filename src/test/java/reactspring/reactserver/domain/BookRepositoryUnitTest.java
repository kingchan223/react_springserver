package reactspring.reactserver.domain;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.*;


/*
 * ::단위 테스트 (DB관련 Bean만 ioc에 등록)::
 * @DataJpaTest -> 디비관련만 메모리에 띄운다. 즉 Repository들을 모두 ioc에 띄운다.
 * @AutoConfigureTestDatabase(replace = ANY) -> 가짜 메모리 DB 사용(여기는 unitTest니까 가짜 DB사용)
 * @AutoConfigureTestDatabase(replace = NONE) -> 실제 DB 사용
 * */
@Transactional
@AutoConfigureTestDatabase(replace = ANY)
@DataJpaTest
public class BookRepositoryUnitTest {
}
