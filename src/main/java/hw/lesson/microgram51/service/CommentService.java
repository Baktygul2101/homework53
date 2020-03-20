package hw.lesson.microgram51.service;


import hw.lesson.microgram51.model.Comment;
import hw.lesson.microgram51.model.User;
import hw.lesson.microgram51.repository.CommentRepo;
import hw.lesson.microgram51.repository.UserRepo;
import org.springframework.stereotype.Service;



@Service
public class CommentService {
    private final CommentRepo commentRepo;
    private final UserRepo userRepo;

    public CommentService(CommentRepo commentRepo,UserRepo userRepo) {
        this.commentRepo = commentRepo;
        this.userRepo=userRepo;
    }


}
