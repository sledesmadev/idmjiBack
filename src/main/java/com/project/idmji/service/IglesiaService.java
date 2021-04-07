package com.project.idmji.service;

import org.springframework.transaction.annotation.Transactional;

import com.project.idmji.dto.IglesiaDTO;
import com.project.idmji.model.Iglesia;
import com.project.idmji.repository.IglesiaRepository;


public class IglesiaService {

	   @Transactional
	    public IglesiaDTO save(IglesiaDTO iglesiaDTO) {
	        Iglesia iglesia = IglesiaRepository.save(mapToSubreddit(subredditDto));
	        iglesiaDTO.setId(iglesia.getId());
	        return subredditDto;
	    }
}
