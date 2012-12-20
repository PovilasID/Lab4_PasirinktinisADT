package lab4_pasirinktinis_adt;
// StackClassic interface
//
// ******************PUBLIC OPERATIONS*********************
// void push( x )         --> Insert x
// Object peek( )         --> Return most recently inserted item
// Object pop( )          --> Return and remove most recent item
// boolean isEmpty( )     --> Return true if empty; else false
// void clear( )          --> Remove all items and go to initianal state
// ******************ERRORS********************************
// peek, pop on empty stack

    /**
     * Protocol for stacks.
     * @author Eimutis
     */
public interface StackClassic<T> {
        /**
         * Insert a new item into the stack.
         * @param x the item to insert.
         */
        void push( T obj );

        /**
         * Get the most recently inserted item in the stack.
         * Does not alter the stack.
         * @return the most recently inserted item in the stack.
         * @exception UnderflowException if the stack is empty.
         */
        T peek( );


        /**
         * Return and remove the most recently inserted item
         * from the stack.
         * @return the most recently inserted item in the stack.
         * @exception UnderflowException if the stack is empty.
         */
        T pop();

        /**
         * Test if the stack is logically empty.
         * @return true if empty, false otherwise.
         */
        boolean isEmpty( );

        /**
         * Make the stack logically empty.
         */
        void clear( );
    }