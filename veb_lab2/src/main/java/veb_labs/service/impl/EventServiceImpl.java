package veb_labs.service.impl;

import org.springframework.stereotype.Service;
import veb_labs.model.Event;
import veb_labs.model.Location;
import veb_labs.model.exception.LocationNotFoundException;
import veb_labs.repository.EventRepository;
import veb_labs.repository.LocationRepository;
import veb_labs.service.EventService;

import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;
    private final LocationRepository locationRepository;

    public EventServiceImpl(EventRepository eventRepository, LocationRepository locationRepository) {
        this.eventRepository = eventRepository;
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Event> listAll() {
        return eventRepository.findAll();
    }

    @Override
    public Optional<Event> findById(Long id) {
        return eventRepository.findById(id);
    }

    @Override
    public List<Event> searchEvents(String text) {
        return eventRepository.searchEvents(text);
    }

    @Override
    public List<Event> searchEventsByTextAndScore(String text, double rating) {
        return eventRepository.searchEventsByTextAndScore(text, rating);
    }

    @Override
    public List<Event> searchEventsByScore(double rating) {
        return eventRepository.searchEventsByScore(rating);
    }

    @Override
    public Optional<Event> saveEvent(Long id,String name, String description, double popularityScore, Long locationId) {

        Location location = locationRepository.findById(locationId).orElseThrow(() -> new LocationNotFoundException(locationId));

        return eventRepository.saveEvent(id,name, description, popularityScore, location);

    }

    @Override
    public void deleteById(Long id) {
        eventRepository.deleteById(id);
    }
}
