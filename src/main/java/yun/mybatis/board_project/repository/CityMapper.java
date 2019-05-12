package yun.mybatis.board_project.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import yun.mybatis.board_project.model.City;

import java.util.List;

@Mapper
@Component
public interface CityMapper {
    City selectCityById(Long id);

    List<City> selectAllCity();

    void insertCity(City city);
}