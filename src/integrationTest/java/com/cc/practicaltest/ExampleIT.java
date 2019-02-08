package com.cc.practicaltest;

import com.cc.practicaltest.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.sql.DataSource;

import static org.assertj.core.api.Assertions.assertThat;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class ExampleIT {

    private JdbcTemplate jdbcTemplate;

    private static final String EXAMPLE_SQL = "SELECT 1";

    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Test
    public void shouldPass() {
        Long result = jdbcTemplate.queryForObject(EXAMPLE_SQL, Long.class);
        assertThat(result).isEqualTo(1);
    }

}