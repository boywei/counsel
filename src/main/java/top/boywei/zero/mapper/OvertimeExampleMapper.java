package top.boywei.zero.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import top.boywei.zero.bean.OvertimeExample;

import java.util.List;

@Repository
public interface OvertimeExampleMapper {
    @ResultType(OvertimeExample.class)
    @Select({
            "<script>",
            "select",
            "distinct user.id id, DATE_FORMAT(line_date,'%Y-%m') month, SUM(hour_number) overtime",
            "from user, work",
            "where user.id = work.id",
            "and user.id = #{id}",
//            在mybatis的sql语句中, 用{}包含的script语句需要
//            &lt;      <     小于号    <= 和&lt;=的表示是一个意思
//            &gt;      >     大于号
//            &amp;     &     和
//            &apos;    ’     单引号
//            &quot;    "     双引号
            "and PERIOD_DIFF(DATE_FORMAT( now(), '%Y%m' ),DATE_FORMAT( line_date, '%Y%m' )) &lt; 12",
            "and PERIOD_DIFF(DATE_FORMAT( now(), '%Y%m' ),DATE_FORMAT( line_date, '%Y%m' )) &gt;= 0",
            "group by id, month",
            "</script>"
    })
    List<OvertimeExample> queryOvertime(@Param("id") Integer id);

}
