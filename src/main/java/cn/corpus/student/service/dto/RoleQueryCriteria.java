package cn.corpus.student.service.dto;

import cn.corpus.annotation.EnableXuedenQuery;
import lombok.Data;

/**功能描述：系统角色查询条件
 * @version:1.0
 */
@Data
public class RoleQueryCriteria {
    /**
     * 根据角色名称、角色编号模糊查询
     */
    @EnableXuedenQuery(blurry = "name,code")
    private String searchValue;
}
