package com.tue.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hospede {
	
	
	private Long id;
	private String nome;
	private String email;
	private String telefone;
	
}
