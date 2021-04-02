package com.nabgc.ecommerce.repository;

import com.nabgc.ecommerce.model.OrderProduct;
import com.nabgc.ecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
