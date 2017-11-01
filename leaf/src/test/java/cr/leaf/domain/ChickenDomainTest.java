package cr.leaf.domain;

import cr.leaf.entity.ChickenDO;
import cr.leaf.repo.ChickenAutoRepo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Beldon.
 * Copyright (c)  2017/11/1, All Rights Reserved.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ChickenDomainTest {


    @Autowired
    private ChickenAutoRepo chickenAutoRepo;

    @Test
    public void eat() throws Exception {
        chickenAutoRepo.deleteAll();

        ChickenDO chickenDO = new ChickenDO();
        chickenDO.setName("jb");
        chickenDO.setAge(1);
        chickenDO.setColor("yellow");

        chickenAutoRepo.save(chickenDO);

        ChickenDomain chickenDomain = new ChickenDomain(chickenDO);
        chickenDomain.eat();

        Assert.assertTrue(chickenDO.isFull());

        ChickenDO temp = chickenAutoRepo.findOne(chickenDO.getId());
        Assert.assertTrue(temp.isFull());
    }

}