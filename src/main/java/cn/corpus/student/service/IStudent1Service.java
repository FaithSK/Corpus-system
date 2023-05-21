package cn.corpus.student.service;

import cn.corpus.student.domain.Student1;
import cn.corpus.student.service.dto.Student1QueryCriteria;
import org.springframework.data.domain.Pageable;

/**功能描述：学生信息业务接口
 * @version:1.0
 */
public interface IStudent1Service {
    /**
     * 获取学生列表数据
     * @param queryCriteria
     * @param pageable
     * @return
     */
    Object getList(Student1QueryCriteria queryCriteria, Pageable pageable);

    /**
     * 添加学生信息
     * @param student
     * @return
     */
    boolean addStudent(Student1 student);

    /**
     * 根据ID获取学生详情信息
     * @param id
     * @return
     */
    Student1 getById(Long id);

    /**
     * 更新学生信息
     * @param student
     */
    void editStudent(Student1 student);

    /**
     * 根据ID删除学生信息
     * @param id
     */
    void deleteById(Long id);

    /**
     * 统计学生人数
     * @return
     */
    long getCount();
}
