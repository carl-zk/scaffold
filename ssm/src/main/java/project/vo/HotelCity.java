package project.vo;

public class HotelCity {
    private String hotelName;
    private String cityName;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "HotelCity{" +
                "hotelName='" + hotelName + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
