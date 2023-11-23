package org.example.fere;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookEntity {
    private AutorEntity autor;
    private String title;
    private PubleherEntity publeher;
    public BookEntity(String title) {
        this.title = title;

    }
}
