package com.rohan.dp.visitor.solution.ex1;

/**
 * We should this pattern when the object structure is stable and we want
 * to support new operations.
 *
 * So, If tomorrow we introduce new type of HTML node, so we need to comeback
 * and modify this interface as well as all the classes that implements it.
 */

// Visitor
public interface Operation {
    void apply(HeadingNode heading);

    void apply(AnchorNode anchor);
}
