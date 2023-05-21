package cn.corpus.student.domain;

import cn.corpus.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

/**功能描述：学生信息实体类
 * @version:1.0
 */
@Data
@Entity
@Table(name = "s_student")
@org.hibernate.annotations.Table(appliesTo = "s_student",comment="学生信息表")
public class Student1 extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 学号
     */
    @Column(name = "stuno")
    private String stuno;

    /**
     * 学生姓名
     */
    @Column(name = "name")
    private String name;

    /**
     * 所属班级
     */
    @ManyToOne(cascade = CascadeType.ALL)
    private GradeClass gradeClass;

    /**
     * 性别
     */
    @Column(name = "sex")
    private String sex;

    /**
     * 手机号
     */
    @Column(name="phone")
    private String phone;

    /**
     * QQ
     */
    @Column(name = "qq")
    private String qq;




}
