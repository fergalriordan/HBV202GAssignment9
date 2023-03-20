package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.List;
import java.util.ArrayList;

public class MultiplyComposite implements MathExpression, Observer {
    private List<MathExpression> children = new ArrayList<>();
    private int lastObservedResult;

    public int getResult() {
        int result = 1;
        for (MathExpression child : children) {
            result *= child.getResult();
        }
        return result;
    }

    public void add(MathExpression child) {
        children.add(child);
    }

    public void remove(MathExpression child) {
        children.remove(child);
    }

    public void update() {
        this.lastObservedResult = 0;
        for (MathExpression child : children) {
            this.lastObservedResult += child.getResult();
        }
        System.out.println(this.lastObservedResult);
    }

    public int getLastObservedResult() {
        return this.lastObservedResult;
    }
    
}
