package ${package}.containerTest;

import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Dubbo服务测试运营类
 * @author jiangzy
 *
 */
public class DubboServiceTest {

	/*
	 * 主函数入口
	 */
	public static void main(String[] args) throws IOException {
		
		// 使用Dubbo框架所推荐的SpringContainer容器启动服务
		com.alibaba.dubbo.container.Main.main(args);
	}

}
