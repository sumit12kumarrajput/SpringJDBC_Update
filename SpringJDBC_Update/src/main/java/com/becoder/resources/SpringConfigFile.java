package com.becoder.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {
	@Bean
	public DriverManagerDataSource myDataSource() {
		DriverManagerDataSource source=new DriverManagerDataSource();
		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		source.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		source.setUsername("root");
		source.setPassword("Satendrasa123@");
		return source;
	}
	@Bean
	public JdbcTemplate myTemplate() {
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(myDataSource());
		return template;
	}

}
