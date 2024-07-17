package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShipmentService {

    @Autowired
    private Repo shipmentRepository;

    public Optional<Shipment> getShipmentByTrackNo(String trackNo) {
        return shipmentRepository.findByTrackNo(trackNo);
    }

    public boolean deleteShipmentByShipId(Integer shipId) {
        if (shipmentRepository.existsById(shipId)) {
            shipmentRepository.deleteById(shipId);
            return true;
        }
        return false;
    }
}