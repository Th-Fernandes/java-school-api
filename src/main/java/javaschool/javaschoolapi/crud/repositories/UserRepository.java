package javaschool.javaschoolapi.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import javaschool.javaschoolapi.crud.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
