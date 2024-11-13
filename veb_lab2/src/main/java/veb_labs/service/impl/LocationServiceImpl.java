package veb_labs.service.impl;

import org.springframework.stereotype.Service;
import veb_labs.model.Location;
import veb_labs.repository.LocationRepository;
import veb_labs.service.LocationService;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> findAll() {
        return locationRepository.findAll();
    }
}
