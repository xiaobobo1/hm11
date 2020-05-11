package com.web.biz;

import java.util.List;

import com.web.entity.TSupplier;


public interface SupplierBiz {
	
	/**
	 * �����б�ȫ��ѯ
	 * @return
	 */
	public List<TSupplier>  queryAll();

	public TSupplier selectByPrimaryKey(Integer sId);

	public int updateByPrimaryKey(TSupplier supplier);

	public int deleteByPrimaryKey(Integer sId);

	 int insert(TSupplier Supplier);

	

}