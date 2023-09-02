package org.test.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.test.service.entity.Apps;

@Mapper
public interface HelloMapper extends BaseMapper<Apps> {
}
