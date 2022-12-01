package com.spring.data.jpa.demo.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.data.jpa.demo.model.Actor;
import com.spring.data.jpa.demo.model.Genre;
import com.spring.data.jpa.demo.model.Movie;
import com.spring.data.jpa.demo.repository.ActorRepository;
import com.spring.data.jpa.demo.repository.GenreRepository;
import com.spring.data.jpa.demo.repository.MovieRepository;

@Controller
public class ActorGenreMovieConrtroller {
	@Autowired
	private GenreRepository genreRepository;
	
	@Autowired
	private ActorRepository actorRepository;
	
	@Autowired
	private MovieRepository movieRepository;
	
	public void run() {
		
		Genre g1 = new Genre ("Comedy",null);
		
		Genre g2 = new Genre ("Thriller",null);
		
		Genre g3 = new Genre ("Sci-fi",null);
		
		genreRepository.save(g1);
		
		genreRepository.save(g2);
		
		genreRepository.save(g3);
		

		//ActorRepository
		Actor a1 = new Actor("Akshay", "Kumar", 1991, null);
		Actor a2 = new Actor("Ajay", "Devgan", 1991, null);
		Actor a3 = new Actor("Darshan", "Raval", 2015, null);
		Actor a4 = new Actor("Arijit", "Singh", 2011, null);
		
		
		
		//Saving objects of type Actor to the database
		actorRepository.save(a1);
		actorRepository.save(a2);
		actorRepository.save(a3);
		actorRepository.save(a4);	

		
		
		Movie m01 = new Movie("Ram Setu",2022 ,null,g1);
		Movie m02 = new Movie("Drishyam",2015 ,null,g2);
		
		// adding Movie records to the database
		movieRepository.save(m01);
		movieRepository.save(m02);
		
		
		//searching Actor records by name
		System.out.println("\n\n Searching Actor records by name : \n ");
		Actor actor01 = actorRepository.findByName("Akshay");
				
		System.out.println(actor01.getId());
		System.out.println(actor01.getName());
		System.out.println(actor01.getLast_name());
		System.out.println(actor01.getYearOfBirth());
		
		//searching for Actor records by id
		System.out.println("\n\n Searching for Actor records by id : \n ");
		Actor actor= actorRepository.findById(1L).get();
		
		System.out.println(actor.getId());
		System.out.println(actor.getName());
		System.out.println(actor.getLast_name());
		System.out.println(actor.getYearOfBirth());
		
		// returning all Actor records
		System.out.println("\n\n Returning all Actor records : \n ");
		List<Actor> actor02 = actorRepository.findAll();
		
		actor02.forEach((a) -> {
	            System.out.println(a.getId());
	            System.out.println(a.getName());
	            System.out.println(a.getLast_name());
	            System.out.println(a.getYearOfBirth());
	      });
		
		//removing Actor record by id from the database
		System.out.println("\n\n Removing Actor record by id from the database : \n ");
		
		actorRepository.deleteById(1L);
		
		System.out.println("\n\n Returning all Actor records after removing : \n ");
		List<Actor> actor03 = actorRepository.findAll();
		
		actor03.forEach((a) -> {
            System.out.println(a.getId());
            System.out.println(a.getName());
            System.out.println(a.getLast_name());
            System.out.println(a.getYearOfBirth());
		});
		
		// searching for Genre records by name
		System.out.println("\n\n Searching for Genre records by name : \n ");
		Genre genre1 = genreRepository.findByName("Comedy");
				
		System.out.println(genre1.getId());
		System.out.println(genre1.getName());
		
		//searching for Genre records by id
		System.out.println("\n\n Searching for Genre records by id : \n ");
		Genre genre = genreRepository.findById(1L).get();
		
		System.out.println(genre.getId());
		System.out.println(genre.getName());
		
		// returning all Genre records
		System.out.println("\n\n Returning all Genre records : \n ");
		List<Genre> genre2 = genreRepository.findAll();
		
		genre2.forEach((g) -> {
	            System.out.println(g.getId());
	            System.out.println(g.getName());
	      });
		
		//removing Genre records from the database
		System.out.println("\n\n Removing Genre records from the database : \n ");
		
		genreRepository.deleteById(1L);
		
		System.out.println("\n\n Returning all Genre records after removing : \n ");
		List<Genre> genre03 = genreRepository.findAll();
		
		genre03.forEach((g) -> {
            System.out.println(g.getId());
            System.out.println(g.getName());
			});
		
		//searching Movie records by title
		System.out.println("\n\n Searching Movie records by title : \n ");
		Movie movie01 = movieRepository.findByTitle("Ram Setu");
				
		System.out.println(movie01.getId());
		System.out.println(movie01.getTitle());
		System.out.println(movie01.getYear_of_release());
		
		//searching for Movie records by id
		System.out.println("\n\n Searching for Movie records by id : \n ");
		Movie movie = movieRepository.findById(1L).get();
		
		System.out.println(movie.getId());
		System.out.println(movie.getTitle());
		System.out.println(movie.getYear_of_release());
		
		// removing Movie records from the database
		System.out.println("\n\n Removing Movie records from the database : \n ");
		
		movieRepository.deleteById(1L);
		
		System.out.println("\n\n Returning all Genre records after removing : \n ");
		List<Movie> movie3 = movieRepository.findAll();
		
		movie3.forEach((m) -> {
            System.out.println(m.getId());
            System.out.println(m.getTitle());
            System.out.println(m.getYear_of_release());     
			});
		
		//returning all Movie records
		System.out.println("\n\n Returning all Movie records : \n ");
		List<Movie> movie2 = movieRepository.findAll();
		
		movie2.forEach((m) -> {
	            System.out.println(m.getId());
	            System.out.println(m.getTitle());
	            System.out.println(m.getYear_of_release());         
	      }
		);
	}

	}
		

	


