package com.rick.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.rick.mall.product.entity.BrandEntity;
import com.rick.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
        list.forEach(System.out::println);
    }

}
