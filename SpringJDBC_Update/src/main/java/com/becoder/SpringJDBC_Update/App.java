package com.becoder.SpringJDBC_Update;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.becoder.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
        JdbcTemplate template=context.getBean(JdbcTemplate.class);
        String query="update student set name='Arun' where name='Rohit'";
        int i=template.update(query);
        if(i>0) {
        	System.out.println("Success");
        }
        else {
        	System.out.println("Failed");
        }
    }
}
