package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.document.Playlist;
import com.example.demo.repository.PlaylistRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlaylistServiceImpl implements PlaylistService{

	@Autowired
	PlaylistRepository playlistRepo;
	
	@Override
	public Flux<Playlist> findAll() {
		return playlistRepo.findAll();
	}

	@Override
	public Mono<Playlist> findById(String id) {
		return playlistRepo.findById(id);
	}

	@Override
	public Mono<Playlist> save(Playlist pl) {
		return playlistRepo.save(pl);
	}

}
