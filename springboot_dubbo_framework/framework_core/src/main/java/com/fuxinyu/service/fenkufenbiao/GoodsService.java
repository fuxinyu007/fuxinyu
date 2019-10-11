package com.fuxinyu.service.fenkufenbiao;

import com.fuxinyu.domain.fenkufenbiao.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author： fuxinyu
 * Date: 2019/10/10
 * Time: 13:55
 * Description:
 */
public interface GoodsService   {
//    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

//    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}
