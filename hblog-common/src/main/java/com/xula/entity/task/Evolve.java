package com.xula.entity.task;
import cn.assist.easydao.pojo.BasePojo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * 用户评估
 *
 * @author xla
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class Evolve extends BasePojo {
	
	private static final long serialVersionUID = 1L;


	private String taskTag;
	/**
	 * 产品类型
	 */
	private int catId;
	/**
	 *  操作人id
	 */
	private int operId;

}
