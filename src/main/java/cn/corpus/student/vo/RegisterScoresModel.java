package cn.corpus.student.vo;

import lombok.Data;

/**功能描述：登记班级学科成绩参数
 * @version:1.0
 */
@Data
public class RegisterScoresModel {

    /**
     * 班级ID
     */
    private Long gradeClassId;

    /**
     * 课程ID
     */
    private Long courseId;
}
