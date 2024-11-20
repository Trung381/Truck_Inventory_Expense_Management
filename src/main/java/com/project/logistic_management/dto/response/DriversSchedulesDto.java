// DriversSchedulesDto.java
package com.project.logistic_management.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DriversSchedulesDto {
    private String licensePlate;
    private Float capacity;
    private String truckNote;
    private List<Schedule> schedules;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Schedule {
        private String driverName;
        private String departureLocation;
        private String destinationLocation;
        private Float commission;
        private Date departureTime;
        private Date arrivalTime;
        private Integer scheduleStatus;
        private Integer paymentStatus;
        private String pathAttachDocument;
        private Long countExpenses;
        private Float totalExpenses;
    }

    // Flat DTO để hỗ trợ QueryDSL
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class FlatDto {
        private String licensePlate;
        private Float capacity;
        private String truckNote;
        private String driverName;
        private String departureLocation;
        private String destinationLocation;
        private Float commission;
        private Date departureTime;
        private Date arrivalTime;
        private Integer scheduleStatus;
        private Integer paymentStatus;
        private String pathAttachDocument;
        private Long countExpenses;
        private Float totalExpenses;
    }
}