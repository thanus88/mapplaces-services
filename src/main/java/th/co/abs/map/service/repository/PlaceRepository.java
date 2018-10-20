package th.co.abs.map.service.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import th.co.abs.map.service.entity.Places;

@RepositoryRestResource(collectionResourceRel = "Places", path = "Places")
public interface PlaceRepository extends CrudRepository<Places, Long> {
	
	//Places findById(@Param("id") String id);

	Places findByObjectid(@Param("object_id") Long object_id);
}
