package com.kyn.common.dto;

import lombok.Builder;

@Builder
public record CartItem(
    String productId,
    String productName,
    Double productPrice,
    String productImage,
    int productQuantity
) {}
