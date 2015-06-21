package forms;


import teaching.WhiteBoard;

public interface Form
{
    void move(int dx, int dy);

    void rotate(Point center, double alpha);

    void draw(WhiteBoard wb);

    void remove();

    Point getCenter();
}
