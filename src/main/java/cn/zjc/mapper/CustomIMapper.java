package cn.zjc.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author zhangjinci
 * @version 2016/9/21 17:04
 * @function
 */
public interface CustomIMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
