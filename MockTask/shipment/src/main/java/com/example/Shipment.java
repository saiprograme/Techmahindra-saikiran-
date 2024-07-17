package com.example;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Shipment {
	@Id
    private Integer shipId;
    private String trackNo;
    private String origin;
    private String destination;
    private String status;
}
