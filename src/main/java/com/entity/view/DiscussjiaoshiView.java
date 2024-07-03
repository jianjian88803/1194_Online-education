package com.entity.view;

import com.entity.DiscussjiaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教师评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-10 22:50:29
 */
@TableName("discussjiaoshi")
public class DiscussjiaoshiView  extends DiscussjiaoshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiaoshiView(){
	}
 
 	public DiscussjiaoshiView(DiscussjiaoshiEntity discussjiaoshiEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiaoshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
