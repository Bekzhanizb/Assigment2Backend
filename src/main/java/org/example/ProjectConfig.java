package org.example;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

    @Bean
    @Lazy
    public TaskManagerService taskManagerService(TaskManagerRepository taskManagerRepository) {
        return new TaskManagerService(taskManagerRepository);
    }

    @Bean
    public TaskManagerService taskManagerService2(TaskManagerRepository taskManagerRepository) {
        return new TaskManagerService(taskManagerRepository);
    }
}
