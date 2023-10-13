package fr.devcrea.demo.controller;

import fr.devcrea.demo.model.Car;
import fr.devcrea.demo.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")//permet l autorisation
@RestController
public class GarageController {

    //injectezr le garageservice dans cette variable
    @Autowired
    private GarageService garageService;


    @RequestMapping(method =RequestMethod.GET,value = "/cars")
    public List<Car> getCars(){
        return garageService.getCars();
    }

    @RequestMapping("/car/{id}")
    public Car getCar(@PathVariable long id){ //pathvariable map sur la variable de la route
        return garageService.getCar(id);
    }

    @RequestMapping(method= RequestMethod.DELETE, value = "/car/{id}")
    public void deleteCar(@PathVariable long id){
        garageService.deleteCar(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/cars")
    public void addCar(@RequestBody Car car){ //passez dans le body de la requete l'objet car
        garageService.addCar(car);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/car/{id}")
    public void update(@RequestBody Car car, @PathVariable long id){
        garageService.updateCar(car, id);
    }
}
