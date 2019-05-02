package com.houstoncounty.repair;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class WeatherRepo {
    private JdbcTemplate jdbcTemplate;

    WeatherRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Weather> getWeather() {

        return jdbcTemplate.query("select * from weather", resultSet -> {
            List<Weather> weathers = new ArrayList<>();
            while(resultSet.next()) {
                weathers.add(new Weather(
                        resultSet.getString("cith"),
                        resultSet.getString("temp_lo"),
                        resultSet.getString("temp_hi"),
                        resultSet.getString("prcp"),
                        resultSet.getString("date")
                    )
                );
            }
            return weathers;
        });
    }
}