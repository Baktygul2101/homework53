package hw.lesson.microgram51.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static java.util.stream.Stream.builder;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Document(collection = "comments")

public class Comment {

    @Id

    private String id;
    private String commentText;
    private LocalDateTime timeCom;
    @DBRef
    private User author;
    private List<Comment> childComments=new ArrayList<>();
    @DBRef
    private Post post;


}