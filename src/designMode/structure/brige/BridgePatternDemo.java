package designMode.structure.brige;

// 实现层接口
interface Color {
    void applyColor();
}

// 具体实现
class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying red color.");
    }
}

class BlueColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying blue color.");
    }
}

// 抽象层
abstract class Shape {
    protected Color color;

    // 构造函数接受颜色实现
    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}

// 细化抽象
class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Drawing a circle, ");
        color.applyColor();
    }
}

class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Drawing a square, ");
        color.applyColor();
    }
}

// 客户端代码
public class BridgePatternDemo {
    public static void main(String[] args) {
        Color red = new RedColor();
        Color blue = new BlueColor();

        Shape redCircle = new Circle(red);
        Shape blueSquare = new Square(blue);

        redCircle.draw();  // 输出: Drawing a circle, Applying red color.
        blueSquare.draw(); // 输出: Drawing a square, Applying blue color.
    }
}