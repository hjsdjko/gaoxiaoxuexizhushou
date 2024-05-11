package com.entity.model;

import com.entity.JiaoanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 教案信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiaoanxinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 教案标题
     */
    private String jiaoanxinxiName;


    /**
     * 教案类型
     */
    private Integer jiaoanxinxiTypes;


    /**
     * 课件下载
     */
    private String jiaoanxinxiFile;


    /**
     * 教师
     */
    private Integer jiaoshiId;


    /**
     * 教案详情
     */
    private String jiaoanxinxiContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：教案标题
	 */
    public String getJiaoanxinxiName() {
        return jiaoanxinxiName;
    }


    /**
	 * 设置：教案标题
	 */
    public void setJiaoanxinxiName(String jiaoanxinxiName) {
        this.jiaoanxinxiName = jiaoanxinxiName;
    }
    /**
	 * 获取：教案类型
	 */
    public Integer getJiaoanxinxiTypes() {
        return jiaoanxinxiTypes;
    }


    /**
	 * 设置：教案类型
	 */
    public void setJiaoanxinxiTypes(Integer jiaoanxinxiTypes) {
        this.jiaoanxinxiTypes = jiaoanxinxiTypes;
    }
    /**
	 * 获取：课件下载
	 */
    public String getJiaoanxinxiFile() {
        return jiaoanxinxiFile;
    }


    /**
	 * 设置：课件下载
	 */
    public void setJiaoanxinxiFile(String jiaoanxinxiFile) {
        this.jiaoanxinxiFile = jiaoanxinxiFile;
    }
    /**
	 * 获取：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 设置：教师
	 */
    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 获取：教案详情
	 */
    public String getJiaoanxinxiContent() {
        return jiaoanxinxiContent;
    }


    /**
	 * 设置：教案详情
	 */
    public void setJiaoanxinxiContent(String jiaoanxinxiContent) {
        this.jiaoanxinxiContent = jiaoanxinxiContent;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
