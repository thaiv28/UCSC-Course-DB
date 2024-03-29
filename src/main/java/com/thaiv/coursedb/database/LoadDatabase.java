package com.thaiv.coursedb.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
      log.info("Data is loaded: " + repository.findById("AM10"));
    };
  }
}