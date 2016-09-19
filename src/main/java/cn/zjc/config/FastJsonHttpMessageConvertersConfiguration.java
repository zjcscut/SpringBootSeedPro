package cn.zjc.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter4;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangjinci
 * @version 2016/9/19 15:42
 * @function 配置fastJson
 */

@Configuration
@ConditionalOnClass({JSON.class})
public class FastJsonHttpMessageConvertersConfiguration {


    @Configuration
    @ConditionalOnClass({FastJsonHttpMessageConverter4.class})
    @ConditionalOnProperty(
            name = {"spring.http.converters.preferred-json-mapper"},
            havingValue = "fastjson",
            matchIfMissing = true
    )
    protected static class FastJson2HttpMessageConverterConfiguration {

        protected FastJson2HttpMessageConverterConfiguration() {
        }

        @Bean
        @ConditionalOnMissingBean({FastJsonHttpMessageConverter4.class})
        public FastJsonHttpMessageConverter4 fastJsonHttpMessageConverter4() {
            FastJsonHttpMessageConverter4 converter = new FastJsonHttpMessageConverter4();
            FastJsonConfig config = new FastJsonConfig();
            config.setSerializerFeatures(
                    SerializerFeature.PrettyFormat,
//                    SerializerFeature.WriteClassName, //输出className
                    SerializerFeature.WriteMapNullValue
            );
            ValueFilter valueFilter = new ValueFilter() {
                //object是class，name是key，value是值
                @Override
                public Object process(Object object, String name, Object value) {
                    if (null == value) {
                        value = "";
                    }
                    return value;
                }
            };
            config.setSerializeFilters(valueFilter);
            converter.setFastJsonConfig(config);
            return converter;
        }
    }
}

