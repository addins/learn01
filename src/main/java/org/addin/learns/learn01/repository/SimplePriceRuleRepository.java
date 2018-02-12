package org.addin.learns.learn01.repository;

import org.addin.learns.learn01.domain.SimplePriceRule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimplePriceRuleRepository extends JpaRepository<SimplePriceRule, Long> {
    Page<SimplePriceRule> findAllByActive(boolean active, Pageable pageable);
}
