package com.sda.car_rental.Model.Dto;

import com.sda.car_rental.Model.Entity.Review;

public class ReviewDTO{
    private Long id;
    private Long costumerId;

    private String review;

    private Long cardId;

    public Long getId() {
        return id;
    }

    public Long getCostumerId() {
        return costumerId;
    }

    public String getReview() {
        return review;
    }

    public Long getCardId() {
        return cardId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCostumerId(Long costumerId) {
        this.costumerId = costumerId;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }
}
