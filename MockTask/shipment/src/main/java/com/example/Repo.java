package com.example;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;
public interface Repo extends CrudRepository<Shipment, Integer>  {
	 Optional<Shipment> findByTrackNo(String trackNo);
}
