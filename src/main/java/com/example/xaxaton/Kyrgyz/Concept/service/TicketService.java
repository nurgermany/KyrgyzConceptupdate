package com.example.xaxaton.Kyrgyz.Concept.service;

import com.example.xaxaton.Kyrgyz.Concept.repository.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TicketService {
    static TicketRepository ticketRepository;


    //  public Ticket getById(Long, id) {
        //String departureAirport;
        //String arrivalAirport;
      //  return ticketRepository.findByDepartureAirportAndArrivalAirport(departureAirport, arrivalAirport);
    //}

//    public Ticket getTicketById(Long id) {
//
//        return ticketRepository.findById(id).orElse(null);
//    }
//
//    public Ticket createTicket(Ticket ticket) {
//
//        return ticketRepository.save(ticket);
//    }
//    public static Ticket updateTicket(Ticket ticket) {
//
//        return ticketRepository.update();
//    }


}
