package cn.easybuy.dao.product;

import cn.easybuy.dao.IBaseDao;
import cn.easybuy.entity.ProductCategory;
import cn.easybuy.param.ProductCategoryParam;

import java.util.List;

/**
 * Created by bdqn on 2016/5/12.
 * addObject(UserAddress userAddress)
 * getRowList(params)
 * getRowCount(params)
 * getById(Integer id)
 * updateByQuery(params)
 */
public interface ProductCategoryDao extends IBaseDao {

	void deleteById(Integer parseLong);//删除商品分类
	
	public List<ProductCategory> queryProductCategorylist(ProductCategoryParam param);

	public List<ProductCategory> queryAllProductCategorylist(ProductCategoryParam param);
	
	public ProductCategory queryProductCategoryById(Integer id);
	
	public Integer save(ProductCategory productCategory) ;
	
	public Integer queryProductCategoryCount(ProductCategoryParam param);
	
	public void update(ProductCategory productCategory) ;
}
