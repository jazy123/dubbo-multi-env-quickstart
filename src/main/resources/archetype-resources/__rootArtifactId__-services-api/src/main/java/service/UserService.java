/**
 * 
 */
package ${package}.service;

import ${package}.domain.User;

/**
 * 用户（服务）接口
 * 
 * @author jiangzy
 *
 */
public interface UserService {

	/**
	 * 注册用户信息
	 * 
	 * @param user
	 */
	public void regist(User user);

	/**
	 * 删除用户信息
	 * 
	 * @param id
	 */
	public void delete(String id);

}
