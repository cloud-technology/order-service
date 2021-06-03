package com.example.demo.orders.interfaces.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Goods object view Data Transfer Object
 */
@ApiModel(description = "Goods object view Data Transfer Object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-03T23:37:39.299902+08:00[Asia/Taipei]")
public class GoodsViewDto{
  @JsonProperty("goodsId")
  private String goodsId;

  @JsonProperty("goodsName")
  private String goodsName;

  @JsonProperty("unitPrice")
  private Integer unitPrice;

  @JsonProperty("count")
  private Integer count;

  public GoodsViewDto goodsId(String goodsId) {
    this.goodsId = goodsId;
    return this;
  }

  /**
   * goods ID
   * @return goodsId
  */
  @ApiModelProperty(required = true, value = "goods ID")
  @NotNull


  public String getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(String goodsId) {
    this.goodsId = goodsId;
  }

  public GoodsViewDto goodsName(String goodsName) {
    this.goodsName = goodsName;
    return this;
  }

  /**
   * goods name
   * @return goodsName
  */
  @ApiModelProperty(required = true, value = "goods name")
  @NotNull


  public String getGoodsName() {
    return goodsName;
  }

  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }

  public GoodsViewDto unitPrice(Integer unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * unit price
   * @return unitPrice
  */
  @ApiModelProperty(required = true, value = "unit price")
  @NotNull


  public Integer getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Integer unitPrice) {
    this.unitPrice = unitPrice;
  }

  public GoodsViewDto count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * 數量
   * @return count
  */
  @ApiModelProperty(required = true, value = "數量")
  @NotNull


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoodsViewDto goodsViewDto = (GoodsViewDto) o;
    return Objects.equals(this.goodsId, goodsViewDto.goodsId) &&
        Objects.equals(this.goodsName, goodsViewDto.goodsName) &&
        Objects.equals(this.unitPrice, goodsViewDto.unitPrice) &&
        Objects.equals(this.count, goodsViewDto.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goodsId, goodsName, unitPrice, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsViewDto {\n");
    
    sb.append("    goodsId: ").append(toIndentedString(goodsId)).append("\n");
    sb.append("    goodsName: ").append(toIndentedString(goodsName)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

