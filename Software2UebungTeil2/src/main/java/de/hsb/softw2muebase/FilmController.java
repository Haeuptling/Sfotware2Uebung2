package de.hsb.softw2muebase;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> origin/master
import java.util.List;


@RestController
public class FilmController {


    @Autowired
    private FilmRepository filmRepository;
    FilmController(){
<<<<<<< HEAD
    }

    @GetMapping(path="/movies")
=======


    }


    @GetMapping(value = "/movies")
>>>>>>> origin/master
    public List<Film> all() {
        return filmRepository.findAll();
    }


    @GetMapping("/movies/{id:[0-9-]+}")
    public ResponseEntity<Object> oneFilmById(@PathVariable int id) {
        if(filmRepository.findById(id).isPresent()){
            return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(filmRepository.findById(id));
        }
        else{
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping("/movies/{name:[A-Z-a-z- A-Z-a-z-]+}")
    public ResponseEntity<Object> getFilmListByName(@PathVariable String name) {
        List<Film> outputFilmList = new ArrayList<>();

        for(Film film : all()){
            if(film.getName().contains(name)) {
                outputFilmList.add(film);
            }
        }
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(outputFilmList);
    }



    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path="/movies")
    public ResponseEntity<?> newMovie(@RequestBody Film newMovie){

<<<<<<< HEAD
        if(newMovie.getName()==null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }else {
=======
        if(newMovie.getName()!=null){
>>>>>>> origin/master
            filmRepository.save(newMovie);
            return  ResponseEntity.status(HttpStatus.CREATED).body(null) ;

        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }
}
