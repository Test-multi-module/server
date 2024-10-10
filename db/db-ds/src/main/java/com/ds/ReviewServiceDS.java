package com.ds;


import com.db.model.Review;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class ReviewServiceDS {

    //private final ReviewRepository reviewRepository;
    public List<Review> list() {
        return null;
        //return reviewRepository.findAll();
    }

    public Review findById(int prdId){
        return null;
       // return reviewRepository.findById(prdId);
    }
    public void addReview(Review review){
        //reviewRepository.save(review);
    }

    public List<Review> getReviewsForProduct(int prdId){
        List<Review> returnList = new ArrayList<>();
        //todo
       /* for (Review review: reviewRepository.findAll()){
            if(review.getProductId() == prdId)
                returnList.add(review);
        }
        return returnList;*/
        return null;
    }
}
