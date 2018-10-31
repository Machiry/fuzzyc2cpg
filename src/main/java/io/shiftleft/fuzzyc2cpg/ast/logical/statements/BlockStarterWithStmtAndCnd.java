package io.shiftleft.fuzzyc2cpg.ast.logical.statements;

import io.shiftleft.fuzzyc2cpg.ast.AstNode;
import io.shiftleft.fuzzyc2cpg.ast.expressions.Condition;

public class BlockStarterWithStmtAndCnd extends BlockStarter {

  @Override
  public void addChild(AstNode node) {
    if (node instanceof Condition) {
      setCondition((Condition) node);
    } else if (node instanceof Statement) {
      setStatement((Statement) node);
    } else {
      super.addChild(node);
    }
  }

}
