package example.controller;

import example.model.Dto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/")
public class ExampleController {
    private static final Logger LOG = Logger.getLogger(ExampleController.class.getName());

    @RequestMapping(value = "endpoint", method = RequestMethod.GET)
    public Dto getExample(){
        LOG.log(Level.CONFIG, "Controller returning first page");
        return new Dto().setResult("dynamically generated content");
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Dto get(){
        return new Dto().setResult("firstPage");
    }
}
