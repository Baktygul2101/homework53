package hw.lesson.microgram51.repository;



import hw.lesson.microgram51.model.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, String> {
    public Iterable<User> findAll(Sort sort);
    public User findByName(String name);
    public User findByEmail(String email);

    boolean existsByEmail(String email);
}
