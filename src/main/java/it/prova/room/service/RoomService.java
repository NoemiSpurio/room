package it.prova.room.service;

import java.util.List;

import it.prova.room.model.Room;

public interface RoomService {

	List<Room> findAll();

	Room findById(Long id);

	Room inserisciNuovo(Room input);

	Room aggiorna(Room input);

	void rimuovi(Long id);

	Room findByNumber(String number);
	
	List<String> findAllNumbers();
}
