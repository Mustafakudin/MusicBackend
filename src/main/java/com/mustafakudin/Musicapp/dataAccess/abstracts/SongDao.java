package com.mustafakudin.Musicapp.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mustafakudin.Musicapp.entities.concretes.Album;
import com.mustafakudin.Musicapp.entities.concretes.Song;

public interface SongDao extends JpaRepository<Song, Integer>{
	Song getById(int songId);
	Song getByName(String songName);

}
