package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 课程
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-10 22:50:28
 */
@TableName("kecheng")
public class KechengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KechengEntity() {
		
	}
	
	public KechengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 课程编号
	 */
					
	private String kechengbianhao;
	
	/**
	 * 课程名称
	 */
					
	private String kechengmingcheng;
	
	/**
	 * 所属分类
	 */
					
	private String suoshufenlei;
	
	/**
	 * 课时数
	 */
					
	private Integer keshishu;
	
	/**
	 * 所属讲师
	 */
					
	private String suoshujiangshi;
	
	/**
	 * 课程封面
	 */
					
	private String kechengfengmian;
	
	/**
	 * 所属大学
	 */
					
	private String suoshudaxue;
	
	/**
	 * 课程视频
	 */
					
	private String kechengshipin;
	
	/**
	 * 课程大纲
	 */
					
	private String kechengdagang;
	
	/**
	 * 课程详情
	 */
					
	private String kechengxiangqing;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	/**
	 * 价格
	 */
					
	private Float price;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：课程编号
	 */
	public void setKechengbianhao(String kechengbianhao) {
		this.kechengbianhao = kechengbianhao;
	}
	/**
	 * 获取：课程编号
	 */
	public String getKechengbianhao() {
		return kechengbianhao;
	}
	/**
	 * 设置：课程名称
	 */
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
	}
	/**
	 * 设置：所属分类
	 */
	public void setSuoshufenlei(String suoshufenlei) {
		this.suoshufenlei = suoshufenlei;
	}
	/**
	 * 获取：所属分类
	 */
	public String getSuoshufenlei() {
		return suoshufenlei;
	}
	/**
	 * 设置：课时数
	 */
	public void setKeshishu(Integer keshishu) {
		this.keshishu = keshishu;
	}
	/**
	 * 获取：课时数
	 */
	public Integer getKeshishu() {
		return keshishu;
	}
	/**
	 * 设置：所属讲师
	 */
	public void setSuoshujiangshi(String suoshujiangshi) {
		this.suoshujiangshi = suoshujiangshi;
	}
	/**
	 * 获取：所属讲师
	 */
	public String getSuoshujiangshi() {
		return suoshujiangshi;
	}
	/**
	 * 设置：课程封面
	 */
	public void setKechengfengmian(String kechengfengmian) {
		this.kechengfengmian = kechengfengmian;
	}
	/**
	 * 获取：课程封面
	 */
	public String getKechengfengmian() {
		return kechengfengmian;
	}
	/**
	 * 设置：所属大学
	 */
	public void setSuoshudaxue(String suoshudaxue) {
		this.suoshudaxue = suoshudaxue;
	}
	/**
	 * 获取：所属大学
	 */
	public String getSuoshudaxue() {
		return suoshudaxue;
	}
	/**
	 * 设置：课程视频
	 */
	public void setKechengshipin(String kechengshipin) {
		this.kechengshipin = kechengshipin;
	}
	/**
	 * 获取：课程视频
	 */
	public String getKechengshipin() {
		return kechengshipin;
	}
	/**
	 * 设置：课程大纲
	 */
	public void setKechengdagang(String kechengdagang) {
		this.kechengdagang = kechengdagang;
	}
	/**
	 * 获取：课程大纲
	 */
	public String getKechengdagang() {
		return kechengdagang;
	}
	/**
	 * 设置：课程详情
	 */
	public void setKechengxiangqing(String kechengxiangqing) {
		this.kechengxiangqing = kechengxiangqing;
	}
	/**
	 * 获取：课程详情
	 */
	public String getKechengxiangqing() {
		return kechengxiangqing;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}

}
