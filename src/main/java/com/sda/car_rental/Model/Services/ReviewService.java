package com.sda.car_rental.Model.Services;


import com.sda.car_rental.Model.Entity.Review;
import com.sda.car_rental.Model.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    public List<Review> listReviews() {
        return reviewRepository.findAll();
    }

    public Optional<Review> getReview(Long id) {
        return reviewRepository.findById(id);
    }

    public Review updateReview(Long id, String name, String description) {
        Optional<Review> optionalReview = reviewRepository.findById(id);
        if (optionalReview.isPresent()) {
            Review review = optionalReview.get();
            review.setName(name);
            review.setDescription(description);
            return reviewRepository.save(review);
        } else {
            throw new IllegalArgumentException("Review with id " + id + " does not exist.");
        }
    }

    public void deleteReview(Long id) {
        if (reviewRepository.existsById(id)) {
            reviewRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Review with id " + id + " does not exist.");
        }
    }
}