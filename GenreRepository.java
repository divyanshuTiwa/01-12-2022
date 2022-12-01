package com.spring.data.jpa.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.data.jpa.demo.model.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre,Long>{
	
	public Genre findBYTitile(String title);
	Optional<Genre> findById(Long id);
	
	List<Genre> findAll();
	
	void deleteById(Long id);
	
	public Genre findByName(String string);

}
