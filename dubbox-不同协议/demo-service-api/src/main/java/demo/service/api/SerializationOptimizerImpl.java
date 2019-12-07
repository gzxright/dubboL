package demo.service.api;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;
import demo.service.api.user.User;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yangjunming on 2/25/16.
 * author: yangjunming@huijiame.com
 */
public class SerializationOptimizerImpl implements SerializationOptimizer {

    @Override
    public Collection<Class> getSerializableClasses() {
        List<Class> classes = new LinkedList<Class>();
        classes.add(User.class);
        classes.add(DataResult.class);

        return classes;
    }
}
