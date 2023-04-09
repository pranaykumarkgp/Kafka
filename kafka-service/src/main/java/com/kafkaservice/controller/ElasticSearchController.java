package com.kafkaservice.controller;


import com.kafkaservice.dto.Product;
import com.kafkaservice.service.ElasticSearchService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/getProducts")
public class ElasticSearchController {

    @Autowired
    private ElasticSearchService elasticSearchService;

    @GetMapping
    public Iterable<Product> getProducts(){
        try{
            log.info("Api call to get all products list from elastic search");
            return elasticSearchService.findAll();
        }catch (Exception e){
            log.error("Exception thrown in the api call , Exception :{}", e.getMessage());
            return null;
        }
    }

}
