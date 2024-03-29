package cn.corpus.annotation.generation;

import cn.corpus.utils.HutoolJWTUtil;
import jakarta.servlet.http.HttpServletRequest;
import org.hibernate.tuple.ValueGenerator;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @version:1.0
 */
final class CreateByGenerators {

    private static final Map<Class<?>, ValueGenerator<?>> GENERATEORS = new HashMap<>();

    public CreateByGenerators() {
    }

    public static ValueGenerator<?> get(Class<?> type){
       ValueGenerator<?> valueGeneratorSupplier = (ValueGenerator)GENERATEORS.get(type);
       if(Objects.isNull(valueGeneratorSupplier)){
           return null;
       }else {
           return valueGeneratorSupplier;
       }
    }
    static {
        GENERATEORS.put(java.lang.Long.class,(session,owner)->{
            // 在此编写实现业务逻辑获取数据
            HttpServletRequest request=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            String token = (String)request.getServletContext().getAttribute("token");
            Long creatBy = HutoolJWTUtil.parseToken(token);
            return creatBy;
        });
    }
}
