package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmingshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmingshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmingshiView;


/**
 * 名师评论表
 *
 * @author 
 * @email 
 * @date 2021-05-10 22:50:29
 */
public interface DiscussmingshiService extends IService<DiscussmingshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmingshiVO> selectListVO(Wrapper<DiscussmingshiEntity> wrapper);
   	
   	DiscussmingshiVO selectVO(@Param("ew") Wrapper<DiscussmingshiEntity> wrapper);
   	
   	List<DiscussmingshiView> selectListView(Wrapper<DiscussmingshiEntity> wrapper);
   	
   	DiscussmingshiView selectView(@Param("ew") Wrapper<DiscussmingshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmingshiEntity> wrapper);
   	
}

