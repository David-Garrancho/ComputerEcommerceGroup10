package za.ac.cput.service;



import za.ac.cput.domain.Review;

import java.util.List;

public interface ReviewService extends IService<Review, Long>{
    List<Review> getAll();
}
