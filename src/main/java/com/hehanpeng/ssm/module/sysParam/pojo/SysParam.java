package com.hehanpeng.ssm.module.sysParam.pojo;

public class SysParam {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_param.sys_param_id
     *
     * @mbggenerated
     */
    private Long sysParamId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_param.sys_param_field
     *
     * @mbggenerated
     */
    private String sysParamField;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_param.sys_param_value
     *
     * @mbggenerated
     */
    private String sysParamValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_param.sys_param_text
     *
     * @mbggenerated
     */
    private String sysParamText;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_param.sys_param_type
     *
     * @mbggenerated
     */
    private String sysParamType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_param.sys_param_id
     *
     * @return the value of sys_param.sys_param_id
     *
     * @mbggenerated
     */
    public Long getSysParamId() {
        return sysParamId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_param.sys_param_id
     *
     * @param sysParamId the value for sys_param.sys_param_id
     *
     * @mbggenerated
     */
    public void setSysParamId(Long sysParamId) {
        this.sysParamId = sysParamId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_param.sys_param_field
     *
     * @return the value of sys_param.sys_param_field
     *
     * @mbggenerated
     */
    public String getSysParamField() {
        return sysParamField;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_param.sys_param_field
     *
     * @param sysParamField the value for sys_param.sys_param_field
     *
     * @mbggenerated
     */
    public void setSysParamField(String sysParamField) {
        this.sysParamField = sysParamField == null ? null : sysParamField.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_param.sys_param_value
     *
     * @return the value of sys_param.sys_param_value
     *
     * @mbggenerated
     */
    public String getSysParamValue() {
        return sysParamValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_param.sys_param_value
     *
     * @param sysParamValue the value for sys_param.sys_param_value
     *
     * @mbggenerated
     */
    public void setSysParamValue(String sysParamValue) {
        this.sysParamValue = sysParamValue == null ? null : sysParamValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_param.sys_param_text
     *
     * @return the value of sys_param.sys_param_text
     *
     * @mbggenerated
     */
    public String getSysParamText() {
        return sysParamText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_param.sys_param_text
     *
     * @param sysParamText the value for sys_param.sys_param_text
     *
     * @mbggenerated
     */
    public void setSysParamText(String sysParamText) {
        this.sysParamText = sysParamText == null ? null : sysParamText.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_param.sys_param_type
     *
     * @return the value of sys_param.sys_param_type
     *
     * @mbggenerated
     */
    public String getSysParamType() {
        return sysParamType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_param.sys_param_type
     *
     * @param sysParamType the value for sys_param.sys_param_type
     *
     * @mbggenerated
     */
    public void setSysParamType(String sysParamType) {
        this.sysParamType = sysParamType == null ? null : sysParamType.trim();
    }
}