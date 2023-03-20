package is.hi.hbv202g.ass9.composite;

import java.util.List;
import java.util.ArrayList;

public class PlusComposite implements MathExpression {
    private List<MathExpression> children = new ArrayList<>();

    public int getResult() {
        int result = 0;
        for (MathExpression child : children) {
            result += child.getResult();
        }
        return result;
    }

    public void add(MathExpression child) {
        children.add(child);
    }

    public void remove(MathExpression child) {
        children.remove(child);
    }
}
