
import java.util.Set;
import java.util.HashSet;

public class Figure
{

    private Set forms;
    
    public Figure()
    {
        forms = new HashSet();
    }
    
    public void add(Object f)
    {
        forms.add(f);
    }    
}
