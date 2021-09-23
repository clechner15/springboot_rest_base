package com.lechner.demo.termin;

import java.time.LocalDate;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.lechner.demo.termin.Termin.*;

/**
 * The Class TerminDataInit.
 */
@Configuration
class TerminDataInit {

  /** The Constant log. */
  private static final org.slf4j.Logger log = LoggerFactory.getLogger(TerminDataInit.class);
  

  /**
   * Inits the database.
   *
   * @param repository the repository
   * @return the command line runner
   */
  @Bean
  CommandLineRunner initDatabase(TerminRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Termin("1", "introduction", LocalDate.now())));
      log.info("Preloading " + repository.save(new Termin("2", "cont", LocalDate.now())));
    };
  }
}