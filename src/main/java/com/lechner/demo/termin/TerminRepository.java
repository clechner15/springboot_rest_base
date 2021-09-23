package com.lechner.demo.termin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The Interface TerminRepository.
 */
@Repository
interface TerminRepository extends JpaRepository<Termin, String> {

}	