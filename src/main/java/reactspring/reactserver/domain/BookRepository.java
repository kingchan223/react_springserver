package reactspring.reactserver.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//JpaRepository extends하면 @Repository 생략가능
public interface BookRepository extends JpaRepository<Book, Long> {
}
