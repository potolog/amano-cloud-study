package com.amano.cloud;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String license;

    @Enumerated(EnumType.STRING)
    private TicketType ticketType;

    private long discount;

    private long regDate;

    private long useDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    public long getDiscount() {
        return discount;
    }

    public void setDiscount(long discount) {
        this.discount = discount;
    }

    public long getRegDate() {
        return regDate;
    }

    public void setRegDate(long regDate) {
        this.regDate = regDate;
    }

    public long getUseDate() {
        return useDate;
    }

    public void setUseDate(long useDate) {
        this.useDate = useDate;
    }
}
