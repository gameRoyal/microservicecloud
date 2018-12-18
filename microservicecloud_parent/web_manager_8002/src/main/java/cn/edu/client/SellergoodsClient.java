package cn.edu.client;


import entity.TbBrand;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("microservicecloud-service-sellergoods")
public interface SellergoodsClient {

    @RequestMapping(value = "/brand", method = RequestMethod.GET)
    public List<TbBrand> findAll();
}
