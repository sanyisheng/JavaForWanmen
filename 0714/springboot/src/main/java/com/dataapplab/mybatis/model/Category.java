package com.dataapplab.mybatis.model;

import java.util.Date;

public class Category {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.id
     *
     * @mbg.generated Fri Jul 06 18:59:31 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.name
     *
     * @mbg.generated Fri Jul 06 18:59:31 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.display_order
     *
     * @mbg.generated Fri Jul 06 18:59:31 CST 2018
     */
    private Integer displayOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.parent_id
     *
     * @mbg.generated Fri Jul 06 18:59:31 CST 2018
     */
    private Integer parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.create_date
     *
     * @mbg.generated Fri Jul 06 18:59:31 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.modified_date
     *
     * @mbg.generated Fri Jul 06 18:59:31 CST 2018
     */
    private Date modifiedDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.id
     *
     * @return the value of category.id
     *
     * @mbg.generated Fri Jul 06 18:59:31 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.id
     *
     * @param id the value for category.id
     *
     * @mbg.generated Fri Jul 06 18:59:31 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.name
     *
     * @return the value of category.name
     *
     * @mbg.generated Fri Jul 06 18:59:31 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.name
     *
     * @param name the value for category.name
     *
     * @mbg.generated Fri Jul 06 18:59:31 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.display_order
     *
     * @return the value of category.display_order
     *
     * @mbg.generated Fri Jul 06 18:59:31 CST 2018
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.display_order
     *
     * @param displayOrder the value for category.display_order
     *
     * @mbg.generated Fri Jul 06 18:59:31 CST 2018
     */
    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.parent_id
     *
     * @return the value of category.parent_id
     *
     * @mbg.generated Fri Jul 06 18:59:31 CST 2018
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.parent_id
     *
     * @param parentId the value for category.parent_id
     *
     * @mbg.generated Fri Jul 06 18:59:31 CST 2018
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.create_date
     *
     * @return the value of category.create_date
     *
     * @mbg.generated Fri Jul 06 18:59:31 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.create_date
     *
     * @param createDate the value for category.create_date
     *
     * @mbg.generated Fri Jul 06 18:59:31 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.modified_date
     *
     * @return the value of category.modified_date
     *
     * @mbg.generated Fri Jul 06 18:59:31 CST 2018
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.modified_date
     *
     * @param modifiedDate the value for category.modified_date
     *
     * @mbg.generated Fri Jul 06 18:59:31 CST 2018
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}