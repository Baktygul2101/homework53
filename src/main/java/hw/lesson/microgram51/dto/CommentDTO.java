package hw.lesson.microgram51.dto;
import lombok.*;
import java.time.LocalDateTime;

@Data
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class CommentDTO {
    private String id = null;
    private String postId;
    private String commentText;
    private LocalDateTime timeCom;
}