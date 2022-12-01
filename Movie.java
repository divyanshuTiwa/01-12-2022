package com.spring.data.jpa.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "movies")
public class Movie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="title", nullable=false, length= 255)
	private String title;
	
	@Column(name ="year_of_release")
	private int year_of_release;
	
	@Column(name="genre_id")
	private int genre_id;

	@ManyToMany(mappedBy = "movies")
	private List<Actor> actors = new ArrayList <Actor>();
	
	@ManyToOne
	@JoinColumn(name ="genre_id")
	private Genre genres;

	public Movie(String string, int i, Genre g2, Object object) {
		super();
	}

	public Movie(int id, String title, int year_of_release, int genre_id, List<Actor> actors, Genre genres) {
		super();
		this.id = id;
		this.title = title;
		this.year_of_release = year_of_release;
		this.genre_id = genre_id;
		this.actors = actors;
		this.genres = genres;
	}
	
	public Movie( String title, int year_of_release, int genre_id, List<Actor> actors, Genre genres) {
		super();
		this.title = title;
		this.year_of_release = year_of_release;
		this.genre_id = genre_id;
		this.actors = actors;
		this.genres = genres;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear_of_release() {
		return year_of_release;
	}

	public void setYear_of_release(int year_of_release) {
		this.year_of_release = year_of_release;
	}

	public int getGenre_id() {
		return genre_id;
	}

	public void setGenre_id(int genre_id) {
		this.genre_id = genre_id;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

	public Genre getGenres() {
		return genres;
	}

	public void setGenres(Genre genres) {
		this.genres = genres;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", year_of_release=" + year_of_release + ", genre_id="
				+ genre_id + ", actors=" + actors + ", genres=" + genres + "]";
	}
	
	
	
	
	
	}
