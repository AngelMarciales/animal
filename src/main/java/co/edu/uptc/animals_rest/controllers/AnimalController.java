package co.edu.uptc.animals_rest.controllers;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import co.edu.uptc.animals_rest.models.Animal;
import co.edu.uptc.animals_rest.models.CustomResponse;
import co.edu.uptc.animals_rest.models.NumberByCategory;
import co.edu.uptc.animals_rest.services.AnimalService;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    private static final Logger logger = LoggerFactory.getLogger(AnimalController.class);

    @Autowired
    private AnimalService animalService;

    @GetMapping("/all")
    public CustomResponse<List<Animal>> getAnimalAll() throws IOException {
        logger.info("getAnimalAll called");
        List<Animal> animals = animalService.getAnimalAll();
        return new CustomResponse<>(animals); // Devolver respuesta personalizada
    }

    @GetMapping("/range")
    public CustomResponse<List<Animal>> getAnimal(@RequestParam int from, @RequestParam int to) throws IOException {
        logger.info("getAnimal called with parameters: from = {}, to = {}", from, to);
        List<Animal> animalsInRange = animalService.getAnimalInRange(from, to);
        return new CustomResponse<>(animalsInRange); // Devolver respuesta personalizada
    }

    @GetMapping("/numberByCategory")
    public CustomResponse<List<NumberByCategory>> getNumberByCategory() throws IOException {
        logger.info("getNumberByCategory called");
        List<NumberByCategory> numberByCategory = animalService.getNumberByCategory();
        return new CustomResponse<>(numberByCategory); // Devolver respuesta personalizada
    }
}
