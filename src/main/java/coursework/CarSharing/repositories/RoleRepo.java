package coursework.CarSharing.repositories;

import org.springframework.data.repository.CrudRepository;

import coursework.CarSharing.entities.UserRole;

public interface RoleRepo extends CrudRepository<UserRole, Long>{
    
}
