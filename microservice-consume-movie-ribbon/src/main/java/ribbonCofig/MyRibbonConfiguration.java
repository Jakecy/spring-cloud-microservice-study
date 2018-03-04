package ribbonCofig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MyRibbonConfiguration {
	/**
	 * 创建一个Ribbon的配置类
	 * 在配置类中定义负载均衡的规则
	 * @return
	 */
	
	@Bean
	public IRule  iRule () {
		return new RandomRule();
	}
}
