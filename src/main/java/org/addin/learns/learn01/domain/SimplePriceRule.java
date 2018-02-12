package org.addin.learns.learn01.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "price_rule_simple")
@DiscriminatorValue(PriceRuleTypeConst.SIMPLE)
public class SimplePriceRule extends PriceRule {

    @Column(name = "max_allowed")
    private Long maxAllowed;

    @Column(name = "percent_off")
    private Float percentOff;

    @Column(name = "fixed_off", precision=10, scale=2)
    private BigDecimal fixedOff;

    @Column(name = "cases")
    private Boolean cases;

    @Column(name = "packs")
    private Boolean packs;

    @Column(name = "pieces")
    private Boolean pieces;

    @ManyToOne
    @NotNull
    private Sku sku;

    public Long getMaxAllowed() {
        return maxAllowed;
    }

    public void setMaxAllowed(Long maxAllowed) {
        this.maxAllowed = maxAllowed;
    }

    public Float getPercentOff() {
        return percentOff;
    }

    public void setPercentOff(Float percentOff) {
        this.percentOff = percentOff;
    }

    public BigDecimal getFixedOff() {
        return fixedOff;
    }

    public void setFixedOff(BigDecimal fixedOff) {
        this.fixedOff = fixedOff;
    }

    public Boolean getCases() {
        return cases;
    }

    public void setCases(Boolean cases) {
        this.cases = cases;
    }

    public Boolean getPacks() {
        return packs;
    }

    public void setPacks(Boolean packs) {
        this.packs = packs;
    }

    public Boolean getPieces() {
        return pieces;
    }

    public void setPieces(Boolean pieces) {
        this.pieces = pieces;
    }

    public Sku getSku() {
        return sku;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }


    public SimplePriceRule maxAllowed(Long maxAllowed) {
        this.maxAllowed = maxAllowed;
        return this;
    }

    public SimplePriceRule percentOff(Float percentOff) {
        this.percentOff = percentOff;
        return this;
    }

    public SimplePriceRule fixedOff(BigDecimal fixedOff) {
        this.fixedOff = fixedOff;
        return this;
    }

    public SimplePriceRule cases(Boolean cases) {
        this.cases = cases;
        return this;
    }

    public SimplePriceRule packs(Boolean packs) {
        this.packs = packs;
        return this;
    }

    public SimplePriceRule pieces(Boolean pieces) {
        this.pieces = pieces;
        return this;
    }

    public SimplePriceRule sku(Sku sku) {
        this.sku = sku;
        return this;
    }
}
