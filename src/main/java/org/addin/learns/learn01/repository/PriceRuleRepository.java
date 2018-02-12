package org.addin.learns.learn01.repository;

import org.addin.learns.learn01.domain.PriceRule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRuleRepository extends JpaRepository<PriceRule, Long> {
}
