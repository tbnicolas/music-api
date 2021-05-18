package com.music.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.entity.Album;
import com.music.repository.AlbumsRepository;
import com.music.service.IAlbumsService;

@Service
public class AlbumsService implements IAlbumsService {
	
	
	@Autowired
	private AlbumsRepository repoAlbums;

	@Override
	public List<Album> buscarTodos() {
		
		return this.repoAlbums.findAll();
	}

	@Override
	public void guardar(Album album) {
		this.repoAlbums.save(album);
	}

	@Override
	public void eliminar(int IdAlbum) {
		this.repoAlbums.deleteById(IdAlbum);
	}

}
