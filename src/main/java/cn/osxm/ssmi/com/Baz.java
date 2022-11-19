package cn.osxm.ssmi.com;

import cn.osxm.ssmi.chp04.model.Bar;
import cn.osxm.ssmi.chp04.model.Foo;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Data
@Component
public class Baz {
    public Foo foo;
    public Bar bar;
}
