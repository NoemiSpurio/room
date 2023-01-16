package it.prova.room.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import it.prova.room.model.Room;

public interface RoomRepository extends CrudRepository<Room, Long> {

	public Room findByNumber(String number);
	
	@Query(value = "select r.number from room r", nativeQuery = true)
	List<String> findAllNumbers();
}
