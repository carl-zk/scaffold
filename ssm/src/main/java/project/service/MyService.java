package project.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.vo.HotelCity;

@Service
public class MyService {
    @Autowired
    private SqlSession sqlSession;

    public void findHotelOfCity() {
        HotelCity hotelCity = sqlSession.selectOne("selectHotelCity");
        System.out.println(hotelCity);
    }
}
