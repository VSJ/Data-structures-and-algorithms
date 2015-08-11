package com.vishal.Datastructures;

/**
 * Created by vj028567 on 5/8/15.
 * Algorithm -
 * Let's put the limit to 10 when it will topple
 * currentStack, isStackFull, createStack, currentSize, array
 * 1,2,3,4,5
 * push()
 *   isFull()
 *      previousStacks.add(currrentStack);
 *      currentStack = createStack()
 *   push the element.
 * pop()
 *   isEmpty()
 *     previousStack isNotEmpty
 *       currentStack = the last previous stack
 *     else
 *       Stack is empty
 *
 */

public class SetOfStacks {
    private static int MAX_SIZE = 10;
    public SetOfStacks() {

    }

}
