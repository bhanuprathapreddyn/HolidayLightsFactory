public class StringLengthFactory extends AbstractFactory {
    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Size getSize(String size) {
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
    @Override
    Length getLength(String length) {

        if (length == null) {
            return null;
        } else if ("10 ft".equals(length)) {
            return new TenFeet();
        } else if ("20 ft".equals(length)) {
            return new TwentyFeet();
        }else if ("100 ft".equals(length)) {
            return new HundredFeet();
        }
        return null;

    }
    @Override
    BulbType getType(String bulbType) {

        return null;
    }
}
