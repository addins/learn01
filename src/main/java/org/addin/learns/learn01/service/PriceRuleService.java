package org.addin.learns.learn01.service;

import org.addin.learns.learn01.domain.PriceRule;
import org.addin.learns.learn01.domain.PriceRuleType;
import org.addin.learns.learn01.domain.SimplePriceRule;
import org.addin.learns.learn01.domain.Sku;
import org.addin.learns.learn01.repository.SimplePriceRuleRepository;
import org.addin.learns.learn01.repository.SkuRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.time.LocalDate;

@Service
@Transactional
public class PriceRuleService {

    private final SimplePriceRuleRepository simplePriceRuleRepository;
    private final SkuRepository skuRepository;

    public PriceRuleService(SimplePriceRuleRepository simplePriceRuleRepository, SkuRepository skuRepository) {
        this.simplePriceRuleRepository = simplePriceRuleRepository;
        this.skuRepository = skuRepository;
    }

    @PostConstruct
    public void init() {

        Sku sku = new Sku()
                .name("Sample SKU")
                .description("sample product");

        skuRepository.save(sku);

        PriceRule simplePriceRule = new SimplePriceRule()
                .sku(sku)
                .cases(true)
                .maxAllowed(3L)
                .percentOff(10F)
                .startDate(LocalDate.now().minusDays(7))
                .endDate(LocalDate.now().plusDays(7))
                .active(true)
                .name("test simple rule")
                .description("this is a test")
                .type(PriceRuleType.SIMPLE);

        simplePriceRuleRepository.save((SimplePriceRule) simplePriceRule);
    }
}
