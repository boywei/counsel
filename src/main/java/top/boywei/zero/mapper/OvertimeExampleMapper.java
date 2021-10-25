package top.boywei.zero.mapper;

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
            "distinct user.id id, DATE_FORMAT(line_date,'%Y-%m-01') month, SUM(hour_number) overtime",
            "from user, work",
            "where user.id=work.id",
            "group by id, month",
            "</script>"
    })
    List<OvertimeExample> queryOvertime();

}
