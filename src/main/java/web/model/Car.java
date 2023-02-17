package web.model;

public class Car {

    private Long id;
    private String brand;

    private String color;

    private Double engineDisplacement;

    public Car() {

    }

    public Car(Long id, String brand, String color, Double engineDisplacement) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.engineDisplacement = engineDisplacement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(Double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }
}
