package web.model;

public class Car {

    private String carColor;

    private String carName;

    private Long seriesNumber;

    public Car(String carColor, String carName, Long seriesNumber) {
        this.carColor = carColor;
        this.carName = carName;
        this.seriesNumber = seriesNumber;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Long getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(Long seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    @Override
    public String toString() {
        return "Car: " +
                "Color='" + carColor + '\'' +
                " , Name='" + carName + '\'' +
                " , Number=" + seriesNumber;
    }
}
