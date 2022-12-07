package creational.simpleFactory;

// Step 3 - Create concrete factory class
public class ButtonFactory {
    // Step 3.5 - Create static method to create different instances
    public static Button createButton(ButtonType type) {
        switch (type) {
            case ROUND: return new RoundButton();
            case PRIMARY: return new PrimaryButton();
        }
        throw new IllegalArgumentException("Invalid Button type " + type);
    }

}
