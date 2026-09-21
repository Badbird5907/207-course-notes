/**
 * A Rectangle.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Creates a rectangle with the given dimensions.
   *
   * @param width the initial width
   * @param height the initial height
   */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /**
   * Returns the area of this rectangle.
   *
   * @return the product of the width and height
   */
  public double area() {
    return width * height;
  }

  /**
   * Multiplies both dimensions of this rectangle by the given factor.
   *
   * @param factor the multiplier applied to the width and height
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Returns whether this rectangle has a greater area than the other rectangle.
   *
   * @param other the rectangle to compare with
   * @return true if this rectangle's area is strictly greater
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
