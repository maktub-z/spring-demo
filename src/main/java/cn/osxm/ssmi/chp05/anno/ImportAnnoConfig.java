package cn.osxm.ssmi.chp05.anno;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppConfig.class})
public class ImportAnnoConfig {
}
