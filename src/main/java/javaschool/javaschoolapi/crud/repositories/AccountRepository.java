package javaschool.javaschoolapi.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import javaschool.javaschoolapi.crud.models.Account;
import java.util.List;


public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByUserId(Long userId);
}
