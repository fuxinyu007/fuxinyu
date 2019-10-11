//package com.fuxinyu.service.fenkufenbiao;
//
//import com.fuxinyu.domain.fenkufenbiao.Goods;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import java.util.List;
//
///**
// * @author： fuxinyu
// * Date: 2019/10/10
// * Time: 14:04
// * Description:
// */
//public interface GoodsRepository extends JpaRepository<Goods, Long> {
//    List<Goods> findAllByGoodsIdBetween(Long goodsId1, Long goodsId2);
//
//    List<Goods> findAllByGoodsIdIn(List<Long> goodsIds);
//}
