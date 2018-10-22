package com.practise.trumpit.persistence;

import com.practise.trumpit.model.Fighter;
import org.springframework.data.repository.CrudRepository;

public interface FighterRepository extends CrudRepository<Fighter,Integer> {

}
