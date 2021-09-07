public class AbstractFactoryPatternDemo {

    public static void main(String... args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

        Shape shape1 = shapeFactory.getShape("Cone");
        shape1.pickShape();

        Shape shape2 = shapeFactory.getShape("Globe");
        shape2.pickShape();

        Shape shape3 = shapeFactory.getShape("Tube");
        shape3.pickShape();

        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");

        Color color1 = colorFactory.getColor("White");
        color1.pickColor();

        Color color2 = colorFactory.getColor("Green");
        color2.pickColor();

        Color color3 = colorFactory.getColor("Blue");
        color3.pickColor();

        Color color4 = colorFactory.getColor("MultiColor");
        color4.pickColor();

        AbstractFactory sizeFactory = FactoryProducer.getFactory("Size");

        Size  size1  = sizeFactory.getSize("one-inch");
        size1.pickSize();

        Size  size2  = sizeFactory.getSize("two-inch");
        size2.pickSize();

        AbstractFactory stringLengthFactory = FactoryProducer.getFactory("Length");

        Length  l1  = stringLengthFactory.getLength("10 ft");
        l1.pickLength();

        Length  l2  = stringLengthFactory.getLength("20 ft");
        l2.pickLength();

        Length  l3  = stringLengthFactory.getLength("100 ft");
        l3.pickLength();

        AbstractFactory bulbTypeFactory = FactoryProducer.getFactory("BulbType");

        BulbType t1 = bulbTypeFactory.getType("c7");
        t1.pickType();

        BulbType t2 = bulbTypeFactory.getType("c9");
        t2.pickType();

        BulbType t3 = bulbTypeFactory.getType("g12");
        t3.pickType();

        BulbType t4 = bulbTypeFactory.getType("LED");
        t4.pickType();


    }
}
