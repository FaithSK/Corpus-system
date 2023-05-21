package cn.corpus.student.service.dto;

import cn.corpus.annotation.EnableXuedenQuery;
import lombok.Data;

/**功能描述：学生信息查询条件
 * @version:1.0
 */
@Data
public class Student1QueryCriteria {

    /**
     * 根据学生姓名、学号、手机号、qq模糊查询
     */
    @EnableXuedenQuery(blurry = "name,stuno,phone,qq")
    private String searchValue;
}
