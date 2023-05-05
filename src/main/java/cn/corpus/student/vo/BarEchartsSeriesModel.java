package cn.corpus.student.vo;

import lombok.Data;

import java.util.List;

/**柱形图返回结果集对象
 * @version:1.0
 */
@Data
public class BarEchartsSeriesModel {
    private List<Double> data;
    private String type;
    private String name;
}
