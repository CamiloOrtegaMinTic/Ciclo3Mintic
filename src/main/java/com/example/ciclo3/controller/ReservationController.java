package com.example.ciclo3.controller;


import com.example.ciclo3.entities.Client;
import com.example.ciclo3.entities.Reservation;
import com.example.ciclo3.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> getAll() { return reservationService.getAll();}
    @GetMapping("/{id}")
    public Optional<Reservation> getTool(@PathVariable("id") int id){
        return reservationService.getReservation(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save  (@RequestBody Reservation a) {return reservationService.save(a);}

}
