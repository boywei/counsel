package top.boywei.counsel.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import top.boywei.counsel.bean.Binding;

import java.util.List;
import java.util.Map;

@Repository
public interface BindingMapper {

    List<Binding> getAllBindings();

}
