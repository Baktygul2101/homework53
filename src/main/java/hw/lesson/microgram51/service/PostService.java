package hw.lesson.microgram51.service;


import hw.lesson.microgram51.repository.CommentRepo;
import hw.lesson.microgram51.repository.PostRepo;
import org.springframework.stereotype.Service;

@Service
public class PostService {


    private final PostRepo postRepo;
    private final CommentRepo commentRepo;


    public PostService(PostRepo postRepo, CommentRepo commentRepo) {
        this.postRepo = postRepo;
        this.commentRepo=commentRepo;
    }


}
