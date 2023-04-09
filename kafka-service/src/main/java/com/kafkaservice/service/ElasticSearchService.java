package com.kafkaservice.service;


import com.kafkaservice.dto.Product;
import com.kafkaservice.dto.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ElasticSearchService {

    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> findAll(){
        try {
            return productRepository.findAll();
        } catch (Exception e) {
            log.error("Cant fetch documents from elastic search, Exception : {}" , e.getMessage());
            return null;
        }
    }
}
