package put.io.black.java.logic;

/**
 * Interface Visitor
 * @see Visitable
 */
public interface Visitor {

    /**
     * Visit (check) node
     * @param node Node to check
     */
    public void visit(Node node);
}
