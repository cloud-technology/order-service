package com.example.demo.orders.interfaces.rest.dto;

import java.util.Objects;
import com.example.demo.orders.interfaces.rest.dto.GoodsViewDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;


/**
 * 訂單檢視模型
 */
@ApiModel(description = "訂單檢視模型")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-03T23:37:39.299902+08:00[Asia/Taipei]")
public class OrderViewDto {
  @JsonProperty("orderId")
  private String orderId;

  @JsonProperty("customerName")
  private String customerName;

  @JsonProperty("totalAmount")
  private Integer totalAmount;

  @JsonProperty("goods")
  @Valid
  private List<GoodsViewDto> goods = new ArrayList<>();

  public OrderViewDto orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * 訂單編號
   * @return orderId
  */
  @ApiModelProperty(required = true, value = "訂單編號")
  @NotNull

@Size(max=60) 
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public OrderViewDto customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

  /**
   * 客戶姓名
   * @return customerName
  */
  @ApiModelProperty(required = true, value = "客戶姓名")
  @NotNull

@Size(max=20) 
  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public OrderViewDto totalAmount(Integer totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * 訂單金額
   * @return totalAmount
  */
  @ApiModelProperty(required = true, value = "訂單金額")
  @NotNull


  public Integer getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Integer totalAmount) {
    this.totalAmount = totalAmount;
  }

  public OrderViewDto goods(List<GoodsViewDto> goods) {
    this.goods = goods;
    return this;
  }

  public OrderViewDto addGoodsItem(GoodsViewDto goodsItem) {
    if (this.goods == null) {
      this.goods = new ArrayList<>();
    }
    this.goods.add(goodsItem);
    return this;
  }

  /**
   * 商品清單
   * @return goods
  */
  @ApiModelProperty(required = true, value = "商品清單")
  @NotNull

  @Valid

  public List<GoodsViewDto> getGoods() {
    return goods;
  }

  public void setGoods(List<GoodsViewDto> goods) {
    this.goods = goods;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderViewDto orderViewDto = (OrderViewDto) o;
    return Objects.equals(this.orderId, orderViewDto.orderId) &&
        Objects.equals(this.customerName, orderViewDto.customerName) &&
        Objects.equals(this.totalAmount, orderViewDto.totalAmount) &&
        Objects.equals(this.goods, orderViewDto.goods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, customerName, totalAmount, goods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderViewDto {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    goods: ").append(toIndentedString(goods)).append("\n");
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

