package veb_labs.service;


import veb_labs.model.EventBooking;

import java.util.List;

public interface EventBookingService {
    EventBooking placeBooking(String eventName, String attendeeName, String attendeeAddress, int numberOfTickets);
    void addBooking(String eventName, String attendeeName, String attendeeAddress, int numberOfTickets);

    List<EventBooking> listAll();

    public List<EventBooking> searchEventsByEventName(String text);
    public List<EventBooking> searchEventsByAttendeeName(String name);
    public List<EventBooking> searchEventsByNumTickets(int tickets);
    public List<EventBooking> searchEvent(String eventName,String attendeeName,int tickets);

}