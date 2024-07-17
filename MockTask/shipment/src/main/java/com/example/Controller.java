package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/shipment")
public class Controller {
	@Autowired
    private ShipmentService shipmentService;

	@GetMapping("/{trackNo}")
    public ResponseEntity<Shipment> getShipmentByTrackNo(@PathVariable String trackNo) {
        Optional<Shipment> shipment = shipmentService.getShipmentByTrackNo(trackNo);
        return shipment.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(404).build());
    }

    @DeleteMapping("/{shipId}")
    public ResponseEntity<String> deleteShipmentByShipId(@PathVariable Integer shipId) {
        boolean isDeleted = shipmentService.deleteShipmentByShipId(shipId);
        if (isDeleted) {
            return ResponseEntity.ok("The requested shipId-" + shipId + " got deleted");
        } else {
            return ResponseEntity.status(404).build();
        }
    }
}
