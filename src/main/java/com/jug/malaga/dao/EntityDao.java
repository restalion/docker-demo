package com.jug.malaga.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jug.malaga.entity.Entidad;

public interface EntityDao extends MongoRepository<Entidad, Long>{

}
