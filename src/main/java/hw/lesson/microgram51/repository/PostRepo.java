package hw.lesson.microgram51.repository;



import hw.lesson.microgram51.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, String> {

}
