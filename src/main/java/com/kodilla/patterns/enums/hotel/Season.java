package com.kodilla.patterns.enums.hotel;

import java.math.BigDecimal;

public enum Season {

    LOW (new BigDecimal(250), new BigDecimal(350)),
    HIGH (new BigDecimal(320), new BigDecimal(400)),
    HOLIDAY (new BigDecimal(400), new BigDecimal(500));

    private final BigDecimal singleRoomPrice;
    private final BigDecimal doubleRoomPrice;

    Season(final BigDecimal singleRoomPrice, final BigDecimal doubleRoomPrice) {
        this.singleRoomPrice = singleRoomPrice;
        this.doubleRoomPrice = doubleRoomPrice;
    }

    public BigDecimal getSingleBedPrice() {
        return singleRoomPrice;
    }

    public BigDecimal getDoubleBedPrice() {
        return doubleRoomPrice;
    }
}
