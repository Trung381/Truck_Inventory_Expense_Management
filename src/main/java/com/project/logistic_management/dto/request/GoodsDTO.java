package com.project.logistic_management.dto.request;

import com.project.logistic_management.entity.Goods;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Builder
@Getter
@Setter
public class GoodsDTO  {
    @NotNull(message = "ID của hàng hoóa không được để trống !")
    private Integer id;
    @NotBlank (message = "Tên của hàng hóa không được để trống !")
    private String name;
    private Float price;
    private Integer quantity;
}
