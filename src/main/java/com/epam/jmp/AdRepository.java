package com.epam.jmp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdRepository extends CrudRepository<AdEntity, Long> {

    AdEntity findOneByName(String name);
}