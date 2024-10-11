package com.db.ds;


import com.db.model.Review;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class ReviewServiceDS {

    public List<Review> list() {
        return null;
    }

    public Review findById(int prdId){
        return null;
    }
    public void addReview(Review review){}

    public List<Review> getReviewsForProduct(int prdId){
        List<Review> returnList = new ArrayList<>();
        return null;
    }
}
