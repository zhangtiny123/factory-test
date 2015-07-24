/**
 * Created by taozhang on 12/21/14.
 */
public class ShapeFactory {
    public ShapeFactory() {

    }

    public static Shape make(ShapeEnum shape) {
        RedDecorater redDecorator = new RedDecorater();
        BorderDecorater borderDecorater = new BorderDecorater();
        switch (shape) {
            case CIRCLE:
                return new CircleShape();

            case RECTANGLE: return new Rectange();
            default: return null;
        }
    }
}
