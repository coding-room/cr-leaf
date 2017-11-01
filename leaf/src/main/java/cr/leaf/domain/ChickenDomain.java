package cr.leaf.domain;

import cr.leaf.entity.ChickenDO;
import cr.leaf.repo.ChickenAutoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

/**
 * @author Beldon.
 * Copyright (c)  2017/11/1, All Rights Reserved.
 */
@Configurable
public class ChickenDomain {

    @Autowired
    private ChickenAutoRepo repo;

    private final ChickenDO entity;

    public void eat() {
        entity.setFull(true);
        repo.save(entity);
    }

    public ChickenDomain(ChickenDO entity) {
        this.entity = entity;
    }

    public ChickenDO getEntity() {
        return entity;
    }
}
