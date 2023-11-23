package org.example.fere;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PubleherEntity {
    private  String publisher;
    private PubleherEntity publeher;
    public  PubleherEntity(String publisher){
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "PubleherEntity{" +
                "publeher=" + publeher +
                '}';
    }
}
