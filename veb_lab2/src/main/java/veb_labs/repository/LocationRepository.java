package veb_labs.repository;

import org.springframework.stereotype.Repository;
import veb_labs.bootstrap.DataHolder;
import veb_labs.model.Location;

import java.util.List;
import java.util.Optional;

@Repository
public class LocationRepository {
    public List<Location> findAll() {
        return DataHolder.locations;
    }

    public Optional<Location> findById(Long id) {
        return DataHolder.locations.stream().filter(i -> i.getId().equals(id)).findFirst();
    }

}
