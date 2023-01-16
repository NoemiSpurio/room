package it.prova.room.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.prova.room.model.Room;
import it.prova.room.repository.RoomRepository;

@Service
@Transactional
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	private RoomRepository repository;

	@Override
	@Transactional(readOnly = true)
	public List<Room> findAll() {
		return (List<Room>) repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Room findById(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public Room inserisciNuovo(Room input) {
		if (input.getId() != null) {
			throw new RuntimeException("Non puoi inserire una stanza con un id associato.");
		}
		
		return repository.save(input);
	}

	@Override
	public Room aggiorna(Room input) {
		return repository.save(input);
	}

	@Override
	public void rimuovi(Long id) {
		repository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Room findByNumber(String number) {
		return repository.findByNumber(number);
	}

	@Override
	@Transactional(readOnly = true)
	public List<String> findAllNumbers() {
		return repository.findAllNumbers();
	}
	
	

}
