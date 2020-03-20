package hw.lesson.microgram51.dto;
import lombok.*;
import java.time.LocalDateTime;

@Data
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class PublDTO {
    private String id;
    private LocalDateTime timePub;
    private String description;
    private int publications = 0;
}