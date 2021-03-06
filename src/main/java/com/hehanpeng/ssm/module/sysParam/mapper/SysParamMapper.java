package com.hehanpeng.ssm.module.sysParam.mapper;

import com.hehanpeng.ssm.module.common.mapper.BaseMapper;
import com.hehanpeng.ssm.module.sysParam.pojo.SysParam;

import java.util.List;

public interface SysParamMapper extends BaseMapper<SysParam> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_param
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long sysParamId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_param
     *
     * @mbggenerated
     */
    int insert(SysParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_param
     *
     * @mbggenerated
     */
    int insertSelective(SysParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_param
     *
     * @mbggenerated
     */
    SysParam selectByPrimaryKey(Long sysParamId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_param
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SysParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_param
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysParam record);

    /**
     * 查询所有系统参数表的记录，包括type=1的记录
     *
     * @param sysParam
     * @return
     */
    public List<SysParam> selectSysParamList(SysParam sysParam);

    /**
     * 查询其他表数据
     *
     * @param sql
     * @return
     */
    public List<SysParam> selectInnerTable(String sql);
}