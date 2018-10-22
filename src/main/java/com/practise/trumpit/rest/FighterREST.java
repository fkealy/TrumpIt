package com.practise.trumpit.rest;

import com.practise.trumpit.model.Fighter;
import com.practise.trumpit.persistence.FighterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/fighters")
public class FighterREST {

    @Autowired
    private FighterRepository fighterRepository;

    @GetMapping(path="/add")
    public @ResponseBody String addNewFighter(@RequestParam String name, @RequestParam String dob, @RequestParam int fightFactor) {
        Fighter fighter = new Fighter();
        fighter.setName(name);
        fighter.setDob(dob);
        fighter.setFightFactor(fightFactor);
        fighterRepository.save(fighter);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Fighter> getAllFighters(){
        return fighterRepository.findAll();
    }

}
