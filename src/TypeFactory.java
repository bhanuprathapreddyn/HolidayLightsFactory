public class TypeFactory extends AbstractFactory {
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
        return null;
    }

    @Override
    BulbType getType(String bulbType) {

        if (bulbType == null) {
            return null;
        } else if ("c7".equals(bulbType)) {
            return new C7();
        }
            else if ("c9".equals(bulbType)) {
                return new C9();
        } else if ("g12".equals(bulbType)) {
            return new G12();
        }else if ("LED".equals(bulbType)) {
            return new LED();
        }
        return null;

    }
}
