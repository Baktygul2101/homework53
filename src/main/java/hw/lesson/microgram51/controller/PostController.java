package hw.lesson.microgram51.controller;


import hw.lesson.microgram51.service.CommentService;
import hw.lesson.microgram51.service.PostService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    private final CommentService commentService;
    private final PostService postService;



    public PostController(CommentService commentService, PostService postService) {
        this.commentService = commentService;
        this.postService = postService;
    }




}