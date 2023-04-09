package com.kafkaservice.producer.serializer;

import com.kafkaservice.dto.Product;
import org.apache.kafka.common.serialization.Serializer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ProductSerializer implements Serializer<Product> {

    @Override
    public byte[] serialize(String s, Product o) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(o);
            oos.close();
            byte[] b = baos.toByteArray();
            return b;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

