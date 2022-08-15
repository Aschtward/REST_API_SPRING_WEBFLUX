package com.example.demo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.document.Playlist;
import com.example.demo.repository.PlaylistRepository;

import reactor.core.publisher.Flux;

/*@Component
public class DummyData implements CommandLineRunner{
	
	@Autowired
	private final PlaylistRepository pl;
	
	DummyData(PlaylistRepository pl){
		this.pl = pl;
	}
	
	@Override
	public void run(String... args) throws Exception{
		pl.deleteAll().thenMany(
				Flux.just("Play1","Play2","Play 3")
				.map(nome -> new Playlist(UUID.randomUUID().toString(),nome))
				.flatMap(pl::save)).subscribe(System.out::println);
	}
	

}*/
