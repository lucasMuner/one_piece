package com.onepiece.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onepiece.crm.Personagens;
import com.onepiece.crm.repository.PersonagemRepository;

@RestController
@RequestMapping("/personagens")
public class OPController{
	
	@Autowired
	private PersonagemRepository personagemRepository;
	
	@GetMapping
	public List<Personagens> listar() {
		return personagemRepository.findAll();
	}
	
	@PostMapping
	public Personagens adicionar(@RequestBody Personagens personagem) {
		return personagemRepository.save(personagem);

	}
	
    @PutMapping("/{id}")
    public ResponseEntity<Personagens> atualizar(@PathVariable Long id, @RequestBody Personagens personagemAtualizado) {
        Personagens personagem = personagemRepository.findById(id);

        personagem.setAkumaNoMi(personagemAtualizado.getAkumaNoMi());
        personagem.setNomePersonagem(personagemAtualizado.getNomePersonagem());
        personagem.setRecompensa(personagemAtualizado.getRecompensa());

        final Personagens personagemAtualizada = personagemRepository.save(personagem);
        return ResponseEntity.ok(personagemAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        personagemRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
	

}
