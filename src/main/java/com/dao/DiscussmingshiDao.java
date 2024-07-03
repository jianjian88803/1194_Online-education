package com.dao;

import com.entity.DiscussmingshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmingshiVO;
import com.entity.view.DiscussmingshiView;


/**
 * 名师评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-10 22:50:29
 */
public interface DiscussmingshiDao extends BaseMapper<DiscussmingshiEntity> {
	
	List<DiscussmingshiVO> selectListVO(@Param("ew") Wrapper<DiscussmingshiEntity> wrapper);
	
	DiscussmingshiVO selectVO(@Param("ew") Wrapper<DiscussmingshiEntity> wrapper);
	
	List<DiscussmingshiView> selectListView(@Param("ew") Wrapper<DiscussmingshiEntity> wrapper);

	List<DiscussmingshiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmingshiEntity> wrapper);
	
	DiscussmingshiView selectView(@Param("ew") Wrapper<DiscussmingshiEntity> wrapper);
	
}
