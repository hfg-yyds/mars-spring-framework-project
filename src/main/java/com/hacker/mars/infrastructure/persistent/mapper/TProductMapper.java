package com.hacker.mars.infrastructure.persistent.mapper;

import com.hacker.mars.infrastructure.persistent.po.TProductPo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Zero
 * @since 2023-11-05
 */
@Mapper
public interface TProductMapper extends BaseMapper<TProductPo> {

}
