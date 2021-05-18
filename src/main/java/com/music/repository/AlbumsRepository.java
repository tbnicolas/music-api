package com.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.music.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
