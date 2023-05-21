package cn.corpus.student.repository;

import cn.corpus.student.domain.Student1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * 功能描述：学生管理持久层
 * @author Administrator
 */
public interface Student1Repository extends JpaRepository<Student1, Long>, JpaSpecificationExecutor<Student1> {
    /**
     * 根据班级ID获取所有学生列表
     * @param gradeClassId
     * @return
     */
    List<Student1> findAllByGradeClassId(Long gradeClassId);
}