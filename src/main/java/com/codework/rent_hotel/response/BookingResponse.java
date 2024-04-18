package com.codework.rent_hotel.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.util.codec.binary.Base64;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingResponse {


        private Long id;

        private LocalDate checkInDate;

        private LocalDate checkOutDate;

        private String guestName;

        private String guestEmail;

        private int numOfAdults;

        private int numOfChildren;

        private int totalNumOfGuests;

        private String bookingConfirmationCode;

        private RoomResponse room;

        public BookingResponse(Long id, LocalDate checkInDate, LocalDate checkOutDate,
                               String bookingConfirmationCode) {
            this.id = id;
            this.checkInDate = checkInDate;
            this.checkOutDate = checkOutDate;
            this.bookingConfirmationCode = bookingConfirmationCode;
        }
}
