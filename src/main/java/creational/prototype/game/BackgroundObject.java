package creational.prototype.game;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Step 2 - create subclasses
@Getter
@Setter
public class BackgroundObject implements GraphicalObject{
    private Integer x;
    private Integer y;
    private Integer width;
    private Integer height;
    private String color;
    private GraphicalObjectType type;

    @Getter(AccessLevel.NONE)     // Hide field from getter
    @Setter(AccessLevel.NONE)     // Hide field from setter
    private List<Integer> pixels = new ArrayList<Integer>();

    public BackgroundObject(Integer x, Integer y, Integer width, Integer height, String color, GraphicalObjectType type) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.type = type;
        this.pixels=someHeavyMethod();
    }

    public BackgroundObject(Integer x, Integer y, Integer width, Integer height, String color, GraphicalObjectType type, List<Integer> pixels) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.type = type;
        this.pixels = pixels;
    }

    private List<Integer> someHeavyMethod() {
        return Collections.emptyList();
    }

    // Step 3 - implement the clone method
    public BackgroundObject clone() {
        return new BackgroundObject(x,y,width,height,color,type,pixels);
    }
}
