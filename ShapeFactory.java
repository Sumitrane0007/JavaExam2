public class ShapeFactory {
    public Shape getShape(String shapeType)
    {
        if(shapeType == null)
        {
            return null;
        }

        else if(shapeType.equalsIgnoreCase("CIRCLE"))
        {
            return new ShapeCircle();
        }

        else if(shapeType.equalsIgnoreCase("RECTANGLE"))
        {
            return new ShapeRectangle();
        }

        else if(shapeType.equalsIgnoreCase("SQUARE"))
        {
            return new ShapeSqaure();
        }

        return null;
    }
}
