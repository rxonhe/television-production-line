package com.choinhet.televisionproductionline;

import com.choinhet.televisionproductionline.model.Television;
import com.choinhet.televisionproductionline.repository.ITelevisionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class TelevisionProductionLineApplicationTests {

    @Autowired
    private ITelevisionRepository televisionRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void createAndSaveTelevision_ThenOk() {
        var savedTelevision = televisionRepository.save(new Television("Samsung Television"));
        assertNotNull(savedTelevision);
    }

}
