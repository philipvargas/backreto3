package com.hiper.repository.crud;

import com.hiper.model.Supplement;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author desarrolloextremo
 */
public interface SupplementCrudRepository extends MongoRepository<Supplement, String> {
    public List<Supplement> findByPriceLessThanEqual(double precio);
    //Reto 5
    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<Supplement> findByDescriptionLike(String description);
}
