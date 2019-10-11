package com.fuxinyu.controller.fenkufenbiao;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fuxinyu.domain.fenkufenbiao.Goods;
import com.fuxinyu.service.fenkufenbiao.GoodsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author： fuxinyu
 * Date: 2019/10/10
 * Time: 13:57
 * Description:
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
//    @Reference
//    private GoodsRepository goodsRepository;
    @Reference
    private GoodsService goodsService;

    @RequestMapping("insert")
    public String insertGoods(Goods goods){
        int i = goodsService.insertSelective(goods);
//        Goods save = goodsRepository.save(goods);
        if (i > 0){
            return "插入成功";

        }
        return "插入失败";
//        return save;
    }


}
