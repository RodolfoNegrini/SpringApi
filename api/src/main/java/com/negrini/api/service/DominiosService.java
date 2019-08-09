package com.negrini.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.negrini.api.repository.RcUfsRepository;
import com.negrini.api.repository.entities.RcUfs;

@Service
@Configurable
public class DominiosService {
	@Autowired
	private RcUfsRepository rcUfsRepository;

	public List<RcUfs> getTodosUFs() {
		return (List<RcUfs>) rcUfsRepository.findAll();
	}

	public Optional<RcUfs> getUfPorID(Integer id) {
		return rcUfsRepository.findById(id);
	}

}
