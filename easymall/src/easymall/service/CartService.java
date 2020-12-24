package easymall.service;

import java.util.List;

import easymall.pojo.Cart;
import easymall.pojo.MyCart;

public interface CartService {
	//添加商品到购物车
	public int addCart(Cart cart);
	//查找购物车是否存在该商品
	public Cart findCart(Cart cart);
	//修改购物车商品数量
	public int updateCart(Cart cart);
	//显示购物车中的所有商品
	public List<MyCart> showcart(int user_id);
	//修改购物车商品数量
	public void updateBuyNum(Cart cart);
	//删除购物车商品
	public void delCart(Integer cartID);
	
	//根据cartID查找购物车
	public MyCart findByCartID(Integer cartID);
}
