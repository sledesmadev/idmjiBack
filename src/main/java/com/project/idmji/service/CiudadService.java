package com.project.idmji.service;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.idmji.model.Ciudad;
import com.project.idmji.repository.CiudadRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CiudadService {
	
	  private final CiudadRepository ciudadRepository;
	
	   @Transactional(readOnly = true)
	    public List<Ciudad> getAll() {
	        return ciudadRepository.findAll()
	                .stream()
//	                .map(this::mapToDto)
	                .collect(toList());
	    }

//	    private SubredditDto mapToDto(Subreddit subreddit) {
//	        return SubredditDto.builder().name(subreddit.getName())
//	                .id(subreddit.getId())
//	                .postCount(subreddit.getPosts().size())
//	                .build();
//	    }

}
