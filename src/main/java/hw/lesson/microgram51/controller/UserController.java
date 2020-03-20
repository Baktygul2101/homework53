package hw.lesson.microgram51.controller;


import hw.lesson.microgram51.model.Comment;
import hw.lesson.microgram51.model.Post;
import hw.lesson.microgram51.model.User;
import hw.lesson.microgram51.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private CommentRepo commentRepo;
    @Autowired
    private PostRepo publicationRepo;
    @Autowired
    private LikeRepository likeRepo;
    @Autowired
    private SubscriptionRepo subscriptionRepo;


    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        // merge
        User userN = userRepo.findById(user.getId()).orElse(user);
        return userN;
    }

    @PostMapping("/postcomment/{id}")
    public List<Comment> getPublication(@PathVariable("id") String id) {
        return commentRepo.findAllByPost(id);
    }

    @GetMapping("/checkUser/{email}")
    public boolean checkEmail(@PathVariable("email") String email) {
        return userRepo.existsByEmail(email);
    }


    @GetMapping("/watchPublication")
    public Iterable<Post> watchAllPublication() {
        return publicationRepo.findAll();
    }
}