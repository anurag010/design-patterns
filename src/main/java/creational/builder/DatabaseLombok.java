package creational.builder;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class DatabaseLombok {
    private String name;
    private String host;
    private Integer port;
    private String password;
}
