package org.addin.learns.learn01.service;

import org.addin.learns.learn01.domain.BuyXGetYPriceRule;
import org.addin.learns.learn01.domain.PriceRule;
import org.addin.learns.learn01.domain.SimplePriceRule;
import org.addin.learns.learn01.domain.Sku;
import org.addin.learns.learn01.repository.PriceRuleRepository;
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
    private final PriceRuleRepository priceRuleRepository;

    public PriceRuleService(SimplePriceRuleRepository simplePriceRuleRepository, SkuRepository skuRepository, PriceRuleRepository priceRuleRepository) {
        this.simplePriceRuleRepository = simplePriceRuleRepository;
        this.skuRepository = skuRepository;
        this.priceRuleRepository = priceRuleRepository;
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
                .description("this is a test");

        PriceRule buyXGetYPriceRule = new BuyXGetYPriceRule()
                .skuBuy(sku)
                .skuGet(sku)
                .casesBuy(true)
                .piecesGet(true)
                .qtyBuy(2L)
                .qtyGet(1L)
                .maxAllowed(3L)
                .active(true)
                .startDate(LocalDate.now().plusDays(5))
                .endDate(LocalDate.now().plusWeeks(5))
                .name("test buy 2 get 1 free")
                .description("test");

        priceRuleRepository.save(simplePriceRule);
        priceRuleRepository.save(buyXGetYPriceRule);
    }
}
