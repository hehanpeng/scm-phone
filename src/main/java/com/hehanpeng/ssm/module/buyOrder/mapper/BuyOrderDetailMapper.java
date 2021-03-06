package com.hehanpeng.ssm.module.buyOrder.mapper;

import com.hehanpeng.ssm.module.buyOrder.pojo.BuyOrderDetail;
import com.hehanpeng.ssm.module.common.mapper.BaseMapper;

import java.util.List;

public interface BuyOrderDetailMapper extends BaseMapper<BuyOrderDetail> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buy_order_detail
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String bodId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buy_order_detail
     *
     * @mbggenerated
     */
    int insert(BuyOrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buy_order_detail
     *
     * @mbggenerated
     */
    int insertSelective(BuyOrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buy_order_detail
     *
     * @mbggenerated
     */
    BuyOrderDetail selectByPrimaryKey(String bodId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buy_order_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BuyOrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buy_order_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(BuyOrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buy_order_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BuyOrderDetail record);

    int insertList(List<BuyOrderDetail> list);
}