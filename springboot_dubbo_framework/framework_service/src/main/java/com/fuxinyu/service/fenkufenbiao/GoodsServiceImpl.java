package com.fuxinyu.service.fenkufenbiao;

import com.alibaba.dubbo.config.annotation.Service;
import com.fuxinyu.domain.fenkufenbiao.Goods;
import com.fuxinyu.mapper.fenkufenbiao.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author： fuxinyu
 * Date: 2019/10/10
 * Time: 13:56
 * Description:
 */
@Component
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

//    @Override
//    public int deleteByPrimaryKey(Integer id) {
//        return 0;
//    }

    @Override
    public int insert(Goods record) {
        return 0;
    }

    @Override
    public int insertSelective(Goods record) {

        return goodsMapper.insertSelective(record);
    }

//    @Override
//    public Goods selectByPrimaryKey(Integer id) {
//        return null;
//    }

    @Override
    public int updateByPrimaryKeySelective(Goods record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Goods record) {
        return 0;
    }
}
