package org.example.fere;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class AutorEntity {
    private AutorEntity autor;
    private String name;
    private String Surnames;
    private String Middlename;

    @Override
    public String toString() {
        return "AutorEntity{" +
                "autor=" + autor +
                '}';
    }
}
