package cn.corpus.student.service.impl;


import cn.corpus.student.domain.Student1;
import cn.corpus.student.repository.Student1Repository;
import cn.corpus.student.service.IStudent1Service;
import cn.corpus.student.service.dto.Student1QueryCriteria;
import cn.corpus.utils.PageUtil;
import cn.corpus.utils.QueryHelp;
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**功能描述：学生信息业务接口实现类
 * @version:1.0
 */
@Service
@Transactional(readOnly = true)
public class Student1ServiceImpl implements IStudent1Service {

    private final Student1Repository studentRepository;

    public Student1ServiceImpl(Student1Repository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /**
     * 获取学生列表数据
     * @param queryCriteria
     * @param pageable
     * @return
     */
    @Override
    public Object getList(Student1QueryCriteria queryCriteria, Pageable pageable) {
        Page<Student1> page = studentRepository.findAll((root, query, criteriaBuilder) -> QueryHelp.getPredicate(root,queryCriteria,criteriaBuilder),pageable);
        return PageUtil.toPage(page);
    }

    /**
     * 添加学生信息
     * @param student
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean addStudent(Student1 student) {
        Student1 dbStudent = studentRepository.save(student);
        return dbStudent.getId()!=null;
    }

    /**
     * 根据ID获取学生详情信息
     * @param id
     * @return
     */
    @Override
    public Student1 getById(Long id) {
        return studentRepository.findById(id).orElseGet(Student1::new);
    }

    /**
     * 更新学生信息
     * @param student
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void editStudent(Student1 student) {
        Student1 dbStudent = studentRepository.getReferenceById(student.getId());
        BeanUtil.copyProperties(student,dbStudent, CopyOptions.create().setIgnoreNullValue(true).setIgnoreError(true));
        studentRepository.save(dbStudent);

    }

    /**
     * 根据ID删除学生信息
     * @param id
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    /**
     * 统计人数
     * @return
     */
    @Override
    public long getCount() {
        return studentRepository.count();
    }
}
