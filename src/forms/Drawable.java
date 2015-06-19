package forms;


import teaching.WhiteBoard;

public abstract class Drawable
{

    protected WhiteBoard wb;
    protected Object shape;

    protected abstract void drawForm();

    public void remove()
    {
        if (this.wb != null) {
            this.wb.wipeShape(shape);
            this.shape = null;
        }
    }

    public void draw(WhiteBoard wb)
    {
        if (this.wb != null) {
            remove();
        }
        this.wb = wb;
        drawForm();
    }
}
