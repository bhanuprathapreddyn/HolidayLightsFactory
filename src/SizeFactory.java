public class SizeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shape) {

        return null;
    }

    @Override
    Color getColor(String color) {

        return null;
    }

    @Override
    Length getLength(String length) {

        return null;
    }
    @Override
    Size getSize(String size) {

        if (size == null) {
            return null;
        } else if ("one-inch".equals(size)) {
            return new OneInch();
        } else if ("two-inch".equals(size)) {
            return new TwoInch();

        }
        return null;

    }
    @Override
    BulbType getType(String bulbType) {

        return null;
    }
}