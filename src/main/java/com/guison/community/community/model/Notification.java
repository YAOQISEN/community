package com.guison.community.community.model;

public class Notification {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.id
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.notifier
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    private Long notifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.recevier
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    private Long recevier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.outerId
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    private Long outerid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.type
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.gmt_create
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.status
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.NOTIFIER_NAME
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    private String notifierName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.OUTER_TITLE
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    private String outerTitle;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.id
     *
     * @return the value of notification.id
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.id
     *
     * @param id the value for notification.id
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.notifier
     *
     * @return the value of notification.notifier
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    public Long getNotifier() {
        return notifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.notifier
     *
     * @param notifier the value for notification.notifier
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    public void setNotifier(Long notifier) {
        this.notifier = notifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.recevier
     *
     * @return the value of notification.recevier
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    public Long getRecevier() {
        return recevier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.recevier
     *
     * @param recevier the value for notification.recevier
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    public void setRecevier(Long recevier) {
        this.recevier = recevier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.outerId
     *
     * @return the value of notification.outerId
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    public Long getOuterid() {
        return outerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.outerId
     *
     * @param outerid the value for notification.outerId
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    public void setOuterid(Long outerid) {
        this.outerid = outerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.type
     *
     * @return the value of notification.type
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.type
     *
     * @param type the value for notification.type
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.gmt_create
     *
     * @return the value of notification.gmt_create
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.gmt_create
     *
     * @param gmtCreate the value for notification.gmt_create
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.status
     *
     * @return the value of notification.status
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.status
     *
     * @param status the value for notification.status
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.NOTIFIER_NAME
     *
     * @return the value of notification.NOTIFIER_NAME
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    public String getNotifierName() {
        return notifierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.NOTIFIER_NAME
     *
     * @param notifierName the value for notification.NOTIFIER_NAME
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    public void setNotifierName(String notifierName) {
        this.notifierName = notifierName == null ? null : notifierName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.OUTER_TITLE
     *
     * @return the value of notification.OUTER_TITLE
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    public String getOuterTitle() {
        return outerTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.OUTER_TITLE
     *
     * @param outerTitle the value for notification.OUTER_TITLE
     *
     * @mbg.generated Wed Nov 20 12:26:21 CST 2019
     */
    public void setOuterTitle(String outerTitle) {
        this.outerTitle = outerTitle == null ? null : outerTitle.trim();
    }
}