package com.dao;

import com.entity.DiscussjiaoshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiaoshiVO;
import com.entity.view.DiscussjiaoshiView;


/**
 * 教师评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-10 22:50:29
 */
public interface DiscussjiaoshiDao extends BaseMapper<DiscussjiaoshiEntity> {
	
	List<DiscussjiaoshiVO> selectListVO(@Param("ew") Wrapper<DiscussjiaoshiEntity> wrapper);
	
	DiscussjiaoshiVO selectVO(@Param("ew") Wrapper<DiscussjiaoshiEntity> wrapper);
	
	List<DiscussjiaoshiView> selectListView(@Param("ew") Wrapper<DiscussjiaoshiEntity> wrapper);

	List<DiscussjiaoshiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiaoshiEntity> wrapper);
	
	DiscussjiaoshiView selectView(@Param("ew") Wrapper<DiscussjiaoshiEntity> wrapper);
	
}
