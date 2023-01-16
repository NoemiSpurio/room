package it.prova.room.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.prova.room.dto.ResponseDTO;
import it.prova.room.model.Room;
import it.prova.room.service.RoomService;

@RestController
@RequestMapping("/api/room")
public class RoomController {

	@Autowired
	private RoomService service;
	
	@GetMapping
	public ResponseDTO listAll() {
		ResponseDTO result = new ResponseDTO(this.service.findAllNumbers());
		return result;
	}
}
