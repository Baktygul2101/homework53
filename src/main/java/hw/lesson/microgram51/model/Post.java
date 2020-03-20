package hw.lesson.microgram51.model;
import lombok.*;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Builder
//@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Document(collection = "posts")

public  class Post {
    //  public static final Post NO_IMAGE = Post.builder().id("-NO-IMAGE-").build();

    @Id

    private String id;
    // здесь будем сохранять картинку
    @Builder.Default
    private Binary posterData = new Binary(new byte[0]);
    private LocalDateTime timePub;
    private String description;
    //  private List<Comment> comments = new ArrayList<>();
    @Indexed
    private int publications = 0;

    public Post(String id, Binary posterData, LocalDateTime timePub, String description, int publications) {
        this.id = id;
        this.posterData = posterData;
        this.timePub = timePub;
        this.description = description;
        this.publications = publications;
    }
}


