public class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shape) {

        if ("Cone".equalsIgnoreCase(shape)) {
            return new Cone();
        }
        else if ("Globe".equalsIgnoreCase(shape)) {
            return new Globe();
        }
        else if ("Tube".equalsIgnoreCase(shape)) {
            return new Tube();
        }

        return null;
    }

    @Override
    Color getColor(String color) {

        return null;
    }
    @Override
    Size getSize(String size) {

        return null;
    }

    @Override
    Length getLength(String length) {

        return null;
    }
    @Override
    BulbType getType(String bulbType) {

        return null;
    }
}
