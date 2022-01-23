package com.youthcon.tdd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/reviews/{id}")
    public Review getByUd(@PathVariable Long id){
        return reviewService.getById(id);
    }

    @PutMapping("/reviews/{id}")
    public Review snedGift(@PathVariable Long id){
        return reviewService.sendGift(id);
    }
}
