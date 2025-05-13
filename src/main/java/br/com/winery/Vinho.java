package br.com.winery;

import java.math.BigDecimal;

public class Vinho {
    private Long id;
    private String name;
    private BigDecimal price;
    private String typeGrape;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getTypeGrape() {
        return typeGrape;
    }

    public void setTypeGrape(String typeGrape) {
        this.typeGrape = typeGrape;
    }
}
