package com.entity.vo;

import com.entity.JiaoanxinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 教案信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiaoanxinxi")
public class JiaoanxinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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

}
