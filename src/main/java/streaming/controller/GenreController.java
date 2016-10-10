/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import streaming.service.GenreCrudService;

/**
 *
 * @author admin
 */
@Controller
public class GenreController {
    
    @Autowired
    private GenreCrudService service;
    
    @RequestMapping(value = "/supprimer_genre/{val}", method = RequestMethod.GET)
    public String supprimer(@PathVariable("val") long genreId) {
        service.delete(genreId);
        
        return "redirect:/liste_genres";
    }
    
    @RequestMapping(value = "/liste_genres", method = RequestMethod.GET)
    public String lister(Model model) {
        model.addAttribute("genres", service.findAllByOrderByNomAsc());
        
        return "genre_lister.jsp";
    }
}
