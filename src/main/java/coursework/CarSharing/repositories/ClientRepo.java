package coursework.CarSharing.repositories;

import org.springframework.data.repository.CrudRepository;

import coursework.CarSharing.entities.Client;

public interface ClientRepo extends CrudRepository<Client, Long> {
    Client findByUsername(String username);
    Client findById(int id);
}
