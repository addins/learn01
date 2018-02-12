package org.addin.learns.learn01.repository;

import org.addin.learns.learn01.domain.Sku;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkuRepository extends JpaRepository<Sku, Long> {
}
