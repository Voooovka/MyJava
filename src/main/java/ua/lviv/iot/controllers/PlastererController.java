package ua.lviv.iot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ua.lviv.iot.models.Plasterer;
import ua.lviv.iot.service.PlastererService;

import java.util.List;

@Controller
public class PlastererController {

    private final PlastererService plastererService;

    @Autowired
    public PlastererController(PlastererService plastererService) {
        this.plastererService = plastererService;
    }

    @GetMapping("/plasterers")
    public String findAll(Model model){
        List<Plasterer> plasterers = plastererService.findAll();
        model.addAttribute("plasterers", plasterers);
        return "plasterer-list";
    }

    @GetMapping("plasterer-delete/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        plastererService.deleteById(id);
        return "redirect:/plasterers";
    }

    @GetMapping("/plasterer-create")
    public String createPlastererForm(Plasterer plasterer){
        return "plasterer-create";
    }

    @PostMapping("/plasterer-create")
    public String createPlasterer(Plasterer plasterer){
        plastererService.savePlasterer(plasterer);
        return "redirect:/plasterers";
    }

    @GetMapping("/plasterer-update/{id}")
    public String updatePlastererForm(@PathVariable("id") Long id, Model model){
        if (plastererService.findById(id) != null) {
            Plasterer plasterer = plastererService.findById(id);
            model.addAttribute("plasterer", plasterer);
            return "plasterer-update";
        }return "error";
    }

    @PostMapping("/plasterer-update")
    public String updatePlasterer(Plasterer plasterer){
        plastererService.savePlasterer(plasterer);
        return "redirect:/plasterers";
    }

    @GetMapping("/plasterer/{id}")
    public String getPlasterer(@PathVariable("id") Long id, Model model){
        if (plastererService.findById(id) != null) {
            Plasterer plasterer = plastererService.findById(id);
            model.addAttribute("plasterer", plasterer);
            return "plasterer";
        }return "error";
    }


}
