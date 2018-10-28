package th.co.abs.map.service.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import th.co.abs.map.service.entity.Places;

@RepositoryRestResource(collectionResourceRel = "Places", path = "Places")
public interface PlaceRepository extends CrudRepository<Places, Long> {
	
	@Query("SELECT p FROM Places p " +
            "WHERE 1=1 " +
            "ORDER BY p.objectid ")
    List<Places> getAllPlaces();
	
	@Query("SELECT p FROM Places p " +
            "WHERE 1=1 " +
            "ORDER BY p.objectid ")
    Optional<List<Places>> getAllPlacesByOptional();

	Places findByObjectid(@Param("object_id") Long object_id);
}
