package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 教案信息
 *
 * @author 
 * @email
 */
@TableName("jiaoanxinxi")
public class JiaoanxinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiaoanxinxiEntity() {

	}

	public JiaoanxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 教案标题
     */
    @TableField(value = "jiaoanxinxi_name")

    private String jiaoanxinxiName;


    /**
     * 教案类型
     */
    @TableField(value = "jiaoanxinxi_types")

    private Integer jiaoanxinxiTypes;


    /**
     * 课件下载
     */
    @TableField(value = "jiaoanxinxi_file")

    private String jiaoanxinxiFile;


    /**
     * 教师
     */
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 教案详情
     */
    @TableField(value = "jiaoanxinxi_content")

    private String jiaoanxinxiContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：教案标题
	 */
    public String getJiaoanxinxiName() {
        return jiaoanxinxiName;
    }
    /**
	 * 获取：教案标题
	 */

    public void setJiaoanxinxiName(String jiaoanxinxiName) {
        this.jiaoanxinxiName = jiaoanxinxiName;
    }
    /**
	 * 设置：教案类型
	 */
    public Integer getJiaoanxinxiTypes() {
        return jiaoanxinxiTypes;
    }
    /**
	 * 获取：教案类型
	 */

    public void setJiaoanxinxiTypes(Integer jiaoanxinxiTypes) {
        this.jiaoanxinxiTypes = jiaoanxinxiTypes;
    }
    /**
	 * 设置：课件下载
	 */
    public String getJiaoanxinxiFile() {
        return jiaoanxinxiFile;
    }
    /**
	 * 获取：课件下载
	 */

    public void setJiaoanxinxiFile(String jiaoanxinxiFile) {
        this.jiaoanxinxiFile = jiaoanxinxiFile;
    }
    /**
	 * 设置：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }
    /**
	 * 获取：教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：教案详情
	 */
    public String getJiaoanxinxiContent() {
        return jiaoanxinxiContent;
    }
    /**
	 * 获取：教案详情
	 */

    public void setJiaoanxinxiContent(String jiaoanxinxiContent) {
        this.jiaoanxinxiContent = jiaoanxinxiContent;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jiaoanxinxi{" +
            "id=" + id +
            ", jiaoanxinxiName=" + jiaoanxinxiName +
            ", jiaoanxinxiTypes=" + jiaoanxinxiTypes +
            ", jiaoanxinxiFile=" + jiaoanxinxiFile +
            ", jiaoshiId=" + jiaoshiId +
            ", jiaoanxinxiContent=" + jiaoanxinxiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
