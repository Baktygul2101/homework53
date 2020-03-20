package hw.lesson.microgram51.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Document(collection = "likes")

public class LikeModel{
        @Id

        private String id;
        @DBRef
        private User whoLikes;
        @DBRef
        private Post whatLikes;
        private LocalDateTime timeLike;
        @Indexed
        private int likes=0;
}