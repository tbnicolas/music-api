package com.music.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.music.entity.Album;
import com.music.service.IAlbumsService;

@RestController
@RequestMapping("/api")
public class AlbumsController {
	
	@Autowired
	private IAlbumsService serviceAlbums;

	@GetMapping("/albums")
	public List<Album> buscarTodos(){
	   List<Album> al = this.serviceAlbums.buscarTodos();
	   al.get(0).setCreadoPor("Nicolas Trujillo");
	   return al;
	}
	
	@PostMapping("/albums")
	public Album guardar(@RequestBody Album album) {
		this.serviceAlbums.guardar(album);
		return album;
		
	}
	
	@PutMapping("/albums")
	public Album modificar(@RequestBody Album album) {
		this.serviceAlbums.guardar(album);
		return album;
	} 
	
	@DeleteMapping("/albums")
	public HashMap<String, String> eliminar(@RequestParam("id") int idAlbum) {
		HashMap<String, String> resp = new HashMap<>();
		this.serviceAlbums.eliminar(idAlbum);
		resp.put("Deleted", "Ok");
		
		return resp;
	}
	
}
