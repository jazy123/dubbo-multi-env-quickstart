/**
 * 
 */
package ${package}.entity;

import java.io.Serializable;

/**
 * 教师信息表
 * @author jiangzy
 *
 */
public class Teacher implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3098059035536333927L;

	private String id;
	private String name;
	private boolean enable;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

}
