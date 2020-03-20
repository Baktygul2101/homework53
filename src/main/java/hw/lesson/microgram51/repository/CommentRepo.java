package hw.lesson.microgram51.repository;



import hw.lesson.microgram51.model.Comment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentRepo extends CrudRepository<Comment, String> {

    List<Comment> findAllByPost(String id);
}
