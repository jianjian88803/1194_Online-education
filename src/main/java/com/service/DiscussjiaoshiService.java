package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiaoshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiaoshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiaoshiView;


/**
 * 教师评论表
 *
 * @author 
 * @email 
 * @date 2021-05-10 22:50:29
 */
public interface DiscussjiaoshiService extends IService<DiscussjiaoshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiaoshiVO> selectListVO(Wrapper<DiscussjiaoshiEntity> wrapper);
   	
   	DiscussjiaoshiVO selectVO(@Param("ew") Wrapper<DiscussjiaoshiEntity> wrapper);
   	
   	List<DiscussjiaoshiView> selectListView(Wrapper<DiscussjiaoshiEntity> wrapper);
   	
   	DiscussjiaoshiView selectView(@Param("ew") Wrapper<DiscussjiaoshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiaoshiEntity> wrapper);
   	
}

