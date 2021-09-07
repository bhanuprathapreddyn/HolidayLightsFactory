public abstract class AbstractFactory {

    abstract Shape getShape(String shape);
    abstract Color getColor(String color);
    abstract Size getSize(String size);
    abstract Length getLength(String length);
    abstract BulbType getType(String bulbType);

}
