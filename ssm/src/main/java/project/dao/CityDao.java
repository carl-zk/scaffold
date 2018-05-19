package project.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;
import project.entity.City;

@Component
public class CityDao {

    private final SqlSession sqlSession;

    public CityDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public City selectCityById(long id) {
        return this.sqlSession.selectOne("selectCityById", id);
    }

}
