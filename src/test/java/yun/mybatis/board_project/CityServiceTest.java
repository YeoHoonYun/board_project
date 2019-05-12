package yun.mybatis.board_project;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import yun.mybatis.board_project.model.City;
import yun.mybatis.board_project.service.CityService;

import java.util.List;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional(transactionManager = "transactionManager")
@Commit
public class CityServiceTest extends DefaultTransactionDefinition {
    @Autowired
    CityService cityService;

    @Test
    public void getCityById() {
        City city = cityService.getCityById(1L);
        System.out.println("TEST : " + city);
        log.info("city : {}", city);
    }

    @Test
    public void getAllCity() {
        List<City> cities = cityService.getAllCity();
        for(City city : cities){
            System.out.println(city);
        }
    }


    @Test
    public void addCities() {
        cityService.addCity(new City("뉴욕", "미국", 1_000_000L));
        cityService.addCity(new City("런던", "영국", 2_000_000L));
        cityService.addCity(new City("파리", "프랑스", 3_000_000L));
        this.getAllCity();
    }
}
