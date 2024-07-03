package com.entity.view;

import com.entity.DiscussmingshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 名师评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-10 22:50:29
 */
@TableName("discussmingshi")
public class DiscussmingshiView  extends DiscussmingshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussmingshiView(){
	}
 
 	public DiscussmingshiView(DiscussmingshiEntity discussmingshiEntity){
 	try {
			BeanUtils.copyProperties(this, discussmingshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
