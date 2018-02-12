package org.addin.learns.learn01.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "price_rule_buyx_gety")
@DiscriminatorValue(PriceRuleTypeConst.BUY_X_GET_Y_FREE)
public class BuyXGetYPriceRule extends PriceRule {
    @Column(name = "max_allowed")
    private Long maxAllowed;

    @Column(name = "qty_buy")
    private Long qtyBuy;

    @Column(name = "cases_buy")
    private Boolean casesBuy;

    @Column(name = "packs_buy")
    private Boolean packsBuy;

    @Column(name = "pieces_buy")
    private Boolean piecesBuy;

    @Column(name = "qty_get")
    private Long qtyGet;

    @Column(name = "cases_get")
    private Boolean casesGet;

    @Column(name = "packs_get")
    private Boolean packsGet;

    @Column(name = "pieces_get")
    private Boolean piecesGet;

    @ManyToOne
    @NotNull
    private Sku skuGet;

    @ManyToOne
    @NotNull
    private Sku skuBuy;

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

    public Boolean getCasesBuy() {
        return casesBuy;
    }

    public void setCasesBuy(Boolean casesBuy) {
        this.casesBuy = casesBuy;
    }

    public Boolean getPacksBuy() {
        return packsBuy;
    }

    public void setPacksBuy(Boolean packsBuy) {
        this.packsBuy = packsBuy;
    }

    public Boolean getPiecesBuy() {
        return piecesBuy;
    }

    public void setPiecesBuy(Boolean piecesBuy) {
        this.piecesBuy = piecesBuy;
    }

    public Long getQtyGet() {
        return qtyGet;
    }

    public void setQtyGet(Long qtyGet) {
        this.qtyGet = qtyGet;
    }

    public Boolean getCasesGet() {
        return casesGet;
    }

    public void setCasesGet(Boolean casesGet) {
        this.casesGet = casesGet;
    }

    public Boolean getPacksGet() {
        return packsGet;
    }

    public void setPacksGet(Boolean packsGet) {
        this.packsGet = packsGet;
    }

    public Boolean getPiecesGet() {
        return piecesGet;
    }

    public void setPiecesGet(Boolean piecesGet) {
        this.piecesGet = piecesGet;
    }

    public Sku getSkuGet() {
        return skuGet;
    }

    public void setSkuGet(Sku skuGet) {
        this.skuGet = skuGet;
    }

    public Sku getSkuBuy() {
        return skuBuy;
    }

    public void setSkuBuy(Sku skuBuy) {
        this.skuBuy = skuBuy;
    }

    public BuyXGetYPriceRule maxAllowed(Long maxAllowed) {
        this.maxAllowed = maxAllowed;
        return this;
    }

    public BuyXGetYPriceRule qtyBuy(Long qtyBuy) {
        this.qtyBuy = qtyBuy;
        return this;
    }

    public BuyXGetYPriceRule casesBuy(Boolean casesBuy) {
        this.casesBuy = casesBuy;
        return this;
    }

    public BuyXGetYPriceRule packsBuy(Boolean packsBuy) {
        this.packsBuy = packsBuy;
        return this;
    }

    public BuyXGetYPriceRule piecesBuy(Boolean piecesBuy) {
        this.piecesBuy = piecesBuy;
        return this;
    }

    public BuyXGetYPriceRule qtyGet(Long qtyGet) {
        this.qtyGet = qtyGet;
        return this;
    }

    public BuyXGetYPriceRule casesGet(Boolean casesGet) {
        this.casesGet = casesGet;
        return this;
    }

    public BuyXGetYPriceRule packsGet(Boolean packsGet) {
        this.packsGet = packsGet;
        return this;
    }

    public BuyXGetYPriceRule piecesGet(Boolean piecesGet) {
        this.piecesGet = piecesGet;
        return this;
    }

    public BuyXGetYPriceRule skuGet(Sku skuGet) {
        this.skuGet = skuGet;
        return this;
    }

    public BuyXGetYPriceRule skuBuy(Sku skuBuy) {
        this.skuBuy = skuBuy;
        return this;
    }
}
