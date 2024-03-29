package lab4_pasirinktinis_adt;
import java.io.PrintStream;

/**
 *
 * @author eimutis
 */
public class StackFixedArray<T> implements StackClassic<T> {
    private static PrintStream so = System.out;
    private T[] stackArray;
    private int topOfStack;
    private static int stackSize;

    /**
     * Construct the stack.
     */
    public StackFixedArray(int stackSize ) {
        stackArray = (T[])new Object[stackSize];
        topOfStack = -1;
        this.stackSize = stackSize;
    }
    public StackFixedArray() {
        this(64);
    }
    /**
     * Get the most recently inserted item in the stack.
     * Does not alter the stack.
     * @return the most recently inserted item in the stack.
     * @throws StackException if the stack is empty.
     */
    public T peek( ) {
        if( topOfStack < 0 )
            throw new StackException(
                 "Steko klaida: vykdoma peek operacija tuščiam stekui");
        return stackArray[topOfStack];
    }

    /**
     * Return and remove the most recently inserted item
     * from the stack.
     * @return the most recently inserted item in the stack.
     * @throws Underflow if the stack is empty.
     */
    public T pop() {
        if( isEmpty( ) )
            throw new StackException(
                 "Steko klaida: vykdoma pop operacija tuščiam stekui");
        return stackArray[topOfStack--];
    }

    /**
     * Insert a new item into the stack.
     * @param x the item to insert.
     */
    public void push(T obj) {
        if( ++topOfStack < stackSize )
            stackArray[topOfStack] = obj;
        else {
            so.println("Paskutinis elementas prieš klaidą yra:" +
                    stackArray[topOfStack-1]);
            throw new StackException(
                "Steko klaida: vykdant push operaciją - masyvo perpildymas");
        }
    }
    /**
     * Test if the stack is logically empty.
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty( ) {
        return topOfStack == -1;
    }

    /**
     * Make the stack logically empty.
     */
    public void clear( ) {
        topOfStack = -1;
    }
    protected void println(){
        so.println("SPAUSDINAMAS STEKO TURINYS:");
        if (topOfStack < 0)
            so.println("STEKAS VISAI NETURI ELEMENTŲ");
        else {
            for (int i = topOfStack; i>=0; i--)
                so.println(stackArray[i]);
            so.println("***************");
        }
    }

}
