
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
}
