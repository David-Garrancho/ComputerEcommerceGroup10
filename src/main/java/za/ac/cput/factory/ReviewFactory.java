package za.ac.cput.factory;

import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Product;
import za.ac.cput.domain.Review;
import za.ac.cput.util.Helper;

import java.util.List;

public class ReviewFactory {

    public static Review buildReview(int rating, Product product, Customer customer) {
        if (Helper.isInvalidInt(rating) || rating > 5 || rating < 0) {
            return null;
        }



        return new Review.Builder()
                .setRating(rating)
                .setProduct(product)
                .setCustomer(customer)
                .build();
    }
}
