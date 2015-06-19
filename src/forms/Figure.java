package forms;


import java.util.Set;
import java.util.HashSet;

public class Figure
{

    private Set<Form> forms;

    public Figure()
    {
        forms = new HashSet<Form>();
    }

    public void add(Form f)
    {
        forms.add(f);
    }

    public void move(int dx, int dy)
    {
        for(Form f : forms) {
            f.move(dx, dy);
        }
    }

    public void rotate(Point center, double alpha)
    {
        for(Form f : forms) {
            f.rotate(center, alpha);
        }
    }

    public void draw(teaching.WhiteBoard wb)
    {
        for(Form f : forms) {
            f.draw(wb);
        }
    }

    public void remove()
    {
        for(Form f : forms) {
            f.remove();
        }
    }
}
