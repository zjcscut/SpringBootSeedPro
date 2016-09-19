package cn.zjc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * @author zhangjinci
 * @version 2016/9/19 16:14
 * @function
 */
@Configuration
public class CustomMvcConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
      for (HttpMessageConverter<?> messageConverter:converters){
          System.out.println(converters);
      }
    }
}
