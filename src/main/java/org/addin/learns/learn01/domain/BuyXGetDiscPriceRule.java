package org.addin.learns.learn01.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @author addin on 2/12/18.
 */
@Entity
@Table(name = "price_rule_buyx_getdisc")
@DiscriminatorValue(PriceRuleTypeConst.BUY_X_GET_DISCOUNT)
public class BuyXGetDiscPriceRule extends PriceRule {

    @Column(name = "max_allowed")
    private Long maxAllowed;

    @Column(name = "qty_buy")
    private Long qtyBuy;

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

    public Long getQtyBuy() {
        return qtyBuy;
    }

    public void setQtyBuy(Long qtyBuy) {
        this.qtyBuy = qtyBuy;
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


    public BuyXGetDiscPriceRule maxAllowed(Long maxAllowed) {
        this.maxAllowed = maxAllowed;
        return this;
    }

    public BuyXGetDiscPriceRule qtyBuy(Long qtyBuy) {
        this.qtyBuy = qtyBuy;
        return this;
    }

    public BuyXGetDiscPriceRule percentOff(Float percentOff) {
        this.percentOff = percentOff;
        return this;
    }

    public BuyXGetDiscPriceRule fixedOff(BigDecimal fixedOff) {
        this.fixedOff = fixedOff;
        return this;
    }

    public BuyXGetDiscPriceRule cases(Boolean cases) {
        this.cases = cases;
        return this;
    }

    public BuyXGetDiscPriceRule packs(Boolean packs) {
        this.packs = packs;
        return this;
    }

    public BuyXGetDiscPriceRule pieces(Boolean pieces) {
        this.pieces = pieces;
        return this;
    }

    public BuyXGetDiscPriceRule sku(Sku sku) {
        this.sku = sku;
        return this;
    }
}
