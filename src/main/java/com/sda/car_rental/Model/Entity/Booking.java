package com.sda.car_rental.Model.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BOOKING")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime bookingDate;

    @Column(nullable = false)
    private LocalDate dateFrom;

    @Column(nullable = false)
    private LocalDate dateTo;

    @Column(nullable = false)
    private double amount;

    @ManyToOne(optional = false)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @OneToOne(optional = false)
    @JoinColumn(name = "car_id", referencedColumnName = "id")
    private CarList car;

    @ManyToOne(optional = false)
    @JoinColumn(name = "branch_id", referencedColumnName = "id")
    private Branches branch;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public CarList getCar() {
        return car;
    }

    public void setCar(CarList car) {
        this.car = car;
    }

    public Branches getBranch() {
        return branch;
    }

    public void setBranch(Branches branch) {
        this.branch = branch;
    }
}
