package com.example.demo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.demo.document.Playlist;

public interface PlaylistRepository  extends ReactiveMongoRepository<Playlist,String> {

}
