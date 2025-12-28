package com.hotel.util;

import com.hotel.model.enums.RoomType;
import java.time.LocalDate;

public class SearchCriteria {

    public RoomType type;
    public LocalDate from;
    public LocalDate to;

    public SearchCriteria(RoomType type, LocalDate from, LocalDate to) {
        this.type = type;
        this.from = from;
        this.to = to;
    }
}