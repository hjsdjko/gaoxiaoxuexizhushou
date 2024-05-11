package com.dao;

import com.entity.JiaoshiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshiLiuyanView;

/**
 * 教师评论 Dao 接口
 *
 * @author 
 */
public interface JiaoshiLiuyanDao extends BaseMapper<JiaoshiLiuyanEntity> {

   List<JiaoshiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
