/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import streaming.entity.Genre;
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
    @RequestMapping(value = "/ajouter_genre", method = RequestMethod.GET)
    public String ajouterGET(Model model) {
        Genre genre = new Genre();
        model.addAttribute("genreAct", genre);
                
        return "ajouter_genre.jsp";
    }
    
    @RequestMapping(value = "/ajouter_genre", method = RequestMethod.POST)
    public String ajouterPOST(@ModelAttribute("genreAct") Genre genre) {
        service.save(genre);
                
        return "redirect:/liste_genres";
    }
    
    @RequestMapping(value = "/modifier_genre/{val}", method = RequestMethod.GET)
    public String modifierGET(@PathVariable("val") long genreId, Model model) {
        Genre genre = service.findOne(genreId);
        model.addAttribute("genreAct", genre);
                
        return "modifier_genre.jsp";
    }
    
    @RequestMapping(value = "/modifier_genre", method = RequestMethod.POST)
    public String modifierPOST(@ModelAttribute("genreAct") Genre genre) {
        service.save(genre);
                
        return "redirect:/liste_genres";
    }

    @RequestMapping(value = {"/liste_genres", "/"}, method = RequestMethod.GET)
    public String lister(Model model) {
//        model.addAttribute("genres", service.findAllByOrderByNomAsc());
        model.addAttribute("genres", service.findAll());
        
        return "genre_lister.jsp";
    }
    
    
}
