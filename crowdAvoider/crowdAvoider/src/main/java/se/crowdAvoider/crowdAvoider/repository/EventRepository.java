package se.crowdAvoider.crowdAvoider.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.crowdAvoider.crowdAvoider.domain.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

    

}
