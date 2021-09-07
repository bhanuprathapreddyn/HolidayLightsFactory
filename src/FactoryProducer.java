public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {

        if ("Shape".equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        }
        else if ("Color".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }
        else if ("Size".equalsIgnoreCase(choice)) {
            return new SizeFactory();
        }
        else if ("Length".equalsIgnoreCase(choice)) {
            return new StringLengthFactory();
        }
        else if ("BulbType".equalsIgnoreCase(choice)) {
            return new TypeFactory();
        }
        return null;
    }
}
