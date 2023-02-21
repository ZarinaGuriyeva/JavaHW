public class Box {
  int heigh;
  int width;
  int depth;

  public Box(int heigh, int width, int depth) {
    this.heigh = heigh;
    this.width = width;
    this.depth = depth;
    System.out.println("Box heigh = " + heigh + " cm");
    System.out.println("Box width = " + width + " cm");
    System.out.println("Box depth = " + depth + " cm");
    System.out.println();
  }

  public Box(int heigh, int width) {
    this.heigh = heigh;
    this.width = width;
    depth = 5;
    System.out.println("Box 2 heigh = " + heigh + " cm");
    System.out.println("Box 2 width = " + width + " cm");
    System.out.println("Box 2 depth = " + depth + " cm");
    System.out.println();

  }

  public Box(int heigh) {
    this.heigh = heigh;
    width = 35;
    depth = 45;
    System.out.println("Box 3 heigh = " + heigh + " cm");
    System.out.println("Box 3 width = " + width + " cm");
    System.out.println("Box 3 depth = " + depth + " cm");
    System.out.println();
  }

  public Box() {
    heigh = 111;
    width = 222;
    depth = 333;

    System.out.println("Box 4 heigh = " + heigh + " cm");
    System.out.println("Box 4 width = " + width + " cm");
    System.out.println("Box 4 depth = " + depth + " cm");
  }
}