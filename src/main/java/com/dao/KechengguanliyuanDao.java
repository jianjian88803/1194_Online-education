package com.dao;

import com.entity.KechengguanliyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengguanliyuanVO;
import com.entity.view.KechengguanliyuanView;


/**
 * 课程管理员
 * 
 * @author 
 * @email 
 * @date 2021-05-10 22:50:28
 */
public interface KechengguanliyuanDao extends BaseMapper<KechengguanliyuanEntity> {
	
	List<KechengguanliyuanVO> selectListVO(@Param("ew") Wrapper<KechengguanliyuanEntity> wrapper);
	
	KechengguanliyuanVO selectVO(@Param("ew") Wrapper<KechengguanliyuanEntity> wrapper);
	
	List<KechengguanliyuanView> selectListView(@Param("ew") Wrapper<KechengguanliyuanEntity> wrapper);

	List<KechengguanliyuanView> selectListView(Pagination page,@Param("ew") Wrapper<KechengguanliyuanEntity> wrapper);
	
	KechengguanliyuanView selectView(@Param("ew") Wrapper<KechengguanliyuanEntity> wrapper);
	
}
