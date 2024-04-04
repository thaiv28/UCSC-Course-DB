package com.thaiv.coursedb.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.thaiv.coursedb.repositories.CourseRepository;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
  
  @Bean
  CommandLineRunner initDatabase(CourseRepository repository) {

    return args -> {
      if(repository.findById("AM10").isPresent()){
        log.info("Data is loaded properly.");
      } else {
        log.info("Data is not loaded properly. Exiting.");
        System.exit(1);
      }
    };
  }
}