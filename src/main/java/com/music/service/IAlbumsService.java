package com.music.service;

import java.util.List;

import com.music.entity.Album;

public interface IAlbumsService {
	
	List<Album> buscarTodos();
	void guardar(Album album);
	void eliminar(int IdAlbum);
	
}
