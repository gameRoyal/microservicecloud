package cn.edu.service;


import cn.edu.dao.BrandJPA;
import entity.TbBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {

    private final BrandJPA brandJPA;

    @Autowired
    public BrandService(BrandJPA brandJPA) {
        this.brandJPA = brandJPA;
    }

    public List<TbBrand> findAll(){

        return brandJPA.findAll();
    }
}
