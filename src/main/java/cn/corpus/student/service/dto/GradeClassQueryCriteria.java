package cn.corpus.student.service.dto;

import cn.corpus.annotation.EnableXuedenQuery;
import lombok.Data;

/**功能描述：班级查询条件
 * @version:1.0
 */
@Data
public class GradeClassQueryCriteria {
    /**
     * 根据班级名称、班级编号模糊查询
     */
    @EnableXuedenQuery(blurry = "name,code")
    private String searchValue;
}
