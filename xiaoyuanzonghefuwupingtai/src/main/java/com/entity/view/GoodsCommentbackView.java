package com.entity.view;

import com.entity.GoodsCommentbackEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 商品评价
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("goods_commentback")
public class GoodsCommentbackView extends GoodsCommentbackEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 goods
			/**
			* 商品编号
			*/
			private String goodsUuidNumber;
			/**
			* 商品名称
			*/
			private String goodsName;
			/**
			* 商品照片
			*/
			private String goodsPhoto;
			/**
			* 商品类型
			*/
			private Integer goodsTypes;
				/**
				* 商品类型的值
				*/
				private String goodsValue;
			/**
			* 商品库存
			*/
			private Integer goodsKucunNumber;
			/**
			* 商品原价
			*/
			private Double goodsOldMoney;
			/**
			* 现价
			*/
			private Double goodsNewMoney;
			/**
			* 点击次数
			*/
			private Integer goodsClicknum;
			/**
			* 商品介绍
			*/
			private String goodsContent;
			/**
			* 商品 的 用户
			*/
			private Integer goodsYonghuId;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer goodsDelete;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public GoodsCommentbackView() {

	}

	public GoodsCommentbackView(GoodsCommentbackEntity goodsCommentbackEntity) {
		try {
			BeanUtils.copyProperties(this, goodsCommentbackEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

























				//级联表的get和set goods

					/**
					* 获取： 商品编号
					*/
					public String getGoodsUuidNumber() {
						return goodsUuidNumber;
					}
					/**
					* 设置： 商品编号
					*/
					public void setGoodsUuidNumber(String goodsUuidNumber) {
						this.goodsUuidNumber = goodsUuidNumber;
					}

					/**
					* 获取： 商品名称
					*/
					public String getGoodsName() {
						return goodsName;
					}
					/**
					* 设置： 商品名称
					*/
					public void setGoodsName(String goodsName) {
						this.goodsName = goodsName;
					}

					/**
					* 获取： 商品照片
					*/
					public String getGoodsPhoto() {
						return goodsPhoto;
					}
					/**
					* 设置： 商品照片
					*/
					public void setGoodsPhoto(String goodsPhoto) {
						this.goodsPhoto = goodsPhoto;
					}

					/**
					* 获取： 商品类型
					*/
					public Integer getGoodsTypes() {
						return goodsTypes;
					}
					/**
					* 设置： 商品类型
					*/
					public void setGoodsTypes(Integer goodsTypes) {
						this.goodsTypes = goodsTypes;
					}


						/**
						* 获取： 商品类型的值
						*/
						public String getGoodsValue() {
							return goodsValue;
						}
						/**
						* 设置： 商品类型的值
						*/
						public void setGoodsValue(String goodsValue) {
							this.goodsValue = goodsValue;
						}

					/**
					* 获取： 商品库存
					*/
					public Integer getGoodsKucunNumber() {
						return goodsKucunNumber;
					}
					/**
					* 设置： 商品库存
					*/
					public void setGoodsKucunNumber(Integer goodsKucunNumber) {
						this.goodsKucunNumber = goodsKucunNumber;
					}

					/**
					* 获取： 商品原价
					*/
					public Double getGoodsOldMoney() {
						return goodsOldMoney;
					}
					/**
					* 设置： 商品原价
					*/
					public void setGoodsOldMoney(Double goodsOldMoney) {
						this.goodsOldMoney = goodsOldMoney;
					}

					/**
					* 获取： 现价
					*/
					public Double getGoodsNewMoney() {
						return goodsNewMoney;
					}
					/**
					* 设置： 现价
					*/
					public void setGoodsNewMoney(Double goodsNewMoney) {
						this.goodsNewMoney = goodsNewMoney;
					}

					/**
					* 获取： 点击次数
					*/
					public Integer getGoodsClicknum() {
						return goodsClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setGoodsClicknum(Integer goodsClicknum) {
						this.goodsClicknum = goodsClicknum;
					}

					/**
					* 获取： 商品介绍
					*/
					public String getGoodsContent() {
						return goodsContent;
					}
					/**
					* 设置： 商品介绍
					*/
					public void setGoodsContent(String goodsContent) {
						this.goodsContent = goodsContent;
					}

					/**
					* 获取：商品 的 用户
					*/
					public Integer getGoodsYonghuId() {
						return goodsYonghuId;
					}
					/**
					* 设置：商品 的 用户
					*/
					public void setGoodsYonghuId(Integer goodsYonghuId) {
						this.goodsYonghuId = goodsYonghuId;
					}


					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getGoodsDelete() {
						return goodsDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setGoodsDelete(Integer goodsDelete) {
						this.goodsDelete = goodsDelete;
					}






















				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}



}
