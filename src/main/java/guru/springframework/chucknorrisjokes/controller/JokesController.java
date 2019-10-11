package guru.springframework.chucknorrisjokes.controller;

import guru.springframework.chucknorrisjokes.service.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/",""})
    public String getQuotes(Model model){
        model.addAttribute("joke",jokesService.getJokes());
        return "jokes";
    }
}
