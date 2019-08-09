package com.negrini.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.negrini.api.repository.entities.RcUfs;
import com.negrini.api.service.DominiosService;

@RestController
@RequestMapping("dominios")
public class DominiosController {
	@Autowired
	private DominiosService dominiosService;

	@RequestMapping(value = "/uf", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<RcUfs>> getTodosUFs() {
		return Optional.ofNullable(dominiosService.getTodosUFs()).map(ufs -> ResponseEntity.ok().body(ufs)) // 200 OK
				.orElseGet(() -> ResponseEntity.notFound().build());
	}

	@RequestMapping(value = "/uf/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Optional<RcUfs>> getUfPorId(@PathVariable Integer id) {
		return Optional.ofNullable(dominiosService.getUfPorID(id)).map(ufs -> ResponseEntity.ok().body(ufs)) // 200 OK
				.orElseGet(() -> ResponseEntity.notFound().build());
	}
}
