/**
 * 
 */
package ${package}.dao;

import java.io.Serializable;
import ${package}.entity.Teacher;

/**
 * 教师数据访问接口
 * @author jiangzy
 *
 */
public interface TeacherDao {
	
	/**
	 * 添加一条教师信息
	 * @param entity
	 */
	public void add(Teacher entity);
	
	/**
	 * 修改教师信息
	 * @param entity
	 */
	public void update(Teacher entity);
	
}
