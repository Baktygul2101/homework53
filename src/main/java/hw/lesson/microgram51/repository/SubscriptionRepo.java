package hw.lesson.microgram51.repository;



import hw.lesson.microgram51.model.SubscriptionModel;
import org.springframework.data.repository.CrudRepository;

public interface SubscriptionRepo extends CrudRepository<SubscriptionModel, String> {

}
