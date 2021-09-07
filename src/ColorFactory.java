public class ColorFactory extends AbstractFactory {
    @Override
    Shape getShape(String shape) {

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

    @Override
    Color getColor(String color) {

        if (color == null) {
            return null;
        }
        else if ("White".equals(color)) {
            return new White();
        }
        else if ("Green".equals(color)) {
            return new Green();
        }
        else if ("Blue".equals(color)) {
            return new Blue();
        }

        else if ("MultiColor".equals(color)) {
            return new MultiColor();
        }

        return null;
    }
}
