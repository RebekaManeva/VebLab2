package veb_labs.service.impl;


import org.springframework.stereotype.Service;
import veb_labs.model.EventBooking;
import veb_labs.repository.EventBookingRepository;
import veb_labs.service.EventBookingService;
import java.util.List;

@Service
public class EventBookingServiceImpl implements EventBookingService {
    private final EventBookingRepository eventBookingRepository;

    public EventBookingServiceImpl(EventBookingRepository eventBookingRepository) {
        this.eventBookingRepository = eventBookingRepository;
    }

    @Override
    public EventBooking placeBooking(String eventName, String attendeeName, String attendeeAddress, int numberOfTickets) {
        return new EventBooking(eventName, attendeeName, attendeeAddress, (long) numberOfTickets);
    }

    @Override
    public void addBooking(String eventName, String attendeeName, String attendeeAddress, int numberOfTickets) {
        eventBookingRepository.addEvent(new EventBooking(eventName, attendeeName, attendeeAddress, (long) numberOfTickets));
    }

    @Override
    public List<EventBooking> listAll() {
        return eventBookingRepository.listAll();
    }

    @Override
    public List<EventBooking> searchEventsByEventName(String text) {
        return eventBookingRepository.searchEventsByEventName(text);
    }

    @Override
    public List<EventBooking> searchEventsByAttendeeName(String name) {
        return eventBookingRepository.searchEventsByAttendeeName(name);
    }

    @Override
    public List<EventBooking> searchEventsByNumTickets(int tickets) {
        return eventBookingRepository.searchEventsByNumTickets(tickets);
    }

    @Override
    public List<EventBooking> searchEvent(String eventName, String attendeeName, int tickets) {
        return eventBookingRepository.searchEvent(eventName,attendeeName,tickets);
    }
}