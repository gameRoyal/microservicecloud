package cn.edu.controller;


import cn.edu.client.SellergoodsClient;
import entity.TbBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class BrandController {

    private final SellergoodsClient sellergoodsClient;

    @Autowired
    public BrandController(SellergoodsClient sellergoodsClient) {
        this.sellergoodsClient = sellergoodsClient;
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<TbBrand> findAll(){


        return sellergoodsClient.findAll();
    }

}
