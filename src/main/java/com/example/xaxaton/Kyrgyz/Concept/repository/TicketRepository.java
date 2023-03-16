package com.example.xaxaton.Kyrgyz.Concept.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByDepartureAirportAndArrivalAirport(String departureAirport, String arrivalAirport);

    Ticket update();
}