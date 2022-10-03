package com.choinhet.televisionproductionline.service;

import com.choinhet.televisionproductionline.model.Television;
import com.choinhet.televisionproductionline.repository.ITelevisionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseService {

    private final ITelevisionRepository televisionRepository;

    public BaseService(ITelevisionRepository televisionRepository) {
        this.televisionRepository = televisionRepository;
    }

    public List<Television> findAll() {
        return (List<Television>) televisionRepository.findAll();
    }

    public void save(Television television) {
        televisionRepository.save(television);
    }
}
