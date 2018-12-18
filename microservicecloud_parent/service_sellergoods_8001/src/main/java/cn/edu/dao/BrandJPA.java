package cn.edu.dao;

import entity.TbBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BrandJPA extends JpaRepository<TbBrand,Long>,JpaSpecificationExecutor<TbBrand> {


}
