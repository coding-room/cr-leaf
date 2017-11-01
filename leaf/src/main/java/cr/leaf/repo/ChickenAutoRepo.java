package cr.leaf.repo;

import cr.leaf.entity.ChickenDO;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Beldon.
 * Copyright (c)  2017/11/1, All Rights Reserved.
 */
public interface ChickenAutoRepo extends MongoRepository<ChickenDO,String> {
}
