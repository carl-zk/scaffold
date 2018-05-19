package project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import project.dao.CityDao;
import project.entity.City;
import project.entity.Hotel;
import project.mapper.HotelMapper;
import project.service.MyService;

@SpringBootApplication
public class SampleXmlApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SampleXmlApplication.class, args);
    }

    private final CityDao cityDao;

    private final HotelMapper hotelMapper;

    @Autowired
    private MyService myService;

    public SampleXmlApplication(CityDao cityDao, HotelMapper hotelMapper) {
        this.cityDao = cityDao;
        this.hotelMapper = hotelMapper;
    }

    @Override
    public void run(String... args) throws Exception {
        City city = this.cityDao.selectCityById(1);
        System.out.println(city);
        Hotel hotel = this.hotelMapper.selectByCityId(1);
        System.out.println(hotel);
        myService.findHotelOfCity();
    }

}
