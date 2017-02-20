package com.jug.malaga.entity;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Entidad {

	@Id
	Long id;
	String value;
}
