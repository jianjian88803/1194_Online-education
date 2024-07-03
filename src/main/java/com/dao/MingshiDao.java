package com.dao;

import com.entity.MingshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MingshiVO;
import com.entity.view.MingshiView;


/**
 * 名师
 * 
 * @author 
 * @email 
 * @date 2021-05-10 22:50:28
 */
public interface MingshiDao extends BaseMapper<MingshiEntity> {
	
	List<MingshiVO> selectListVO(@Param("ew") Wrapper<MingshiEntity> wrapper);
	
	MingshiVO selectVO(@Param("ew") Wrapper<MingshiEntity> wrapper);
	
	List<MingshiView> selectListView(@Param("ew") Wrapper<MingshiEntity> wrapper);

	List<MingshiView> selectListView(Pagination page,@Param("ew") Wrapper<MingshiEntity> wrapper);
	
	MingshiView selectView(@Param("ew") Wrapper<MingshiEntity> wrapper);
	
}
