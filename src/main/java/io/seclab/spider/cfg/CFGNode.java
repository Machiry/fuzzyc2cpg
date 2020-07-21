package io.seclab.spider.cfg;

import io.shiftleft.fuzzyc2cpg.ast.AstNode;

public class CFGNode {

    private AstNode astNode;
    private String nodeLabel;

    public CFGNode(AstNode node) {
        if (node == null) {
            throw new IllegalArgumentException("node must not be null");
        }
        setASTNode(node);
        nodeLabel = "";
    }

    public CFGNode(String nLabel) {
        this.nodeLabel = nLabel;
    }

    private void setASTNode(AstNode astNode) {
        this.astNode = astNode;
        this.astNode.markAsCFGNode();
    }

    public AstNode getASTNode() {
        return astNode;
    }

    public String getEscapedCodeStr() {
        if (getASTNode() == null)
            return "";

        return getASTNode().getEscapedCodeStr();
    }

    public void markAsCFGNode() {
        if (getASTNode() == null)
            return;
        getASTNode().markAsCFGNode();
    }

    @Override
    public int hashCode() {
        if (astNode != null) {
            return astNode.hashCode();
        }
        return nodeLabel.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof CFGNode) {
            CFGNode other = (CFGNode) obj;
            return other.astNode == astNode || nodeLabel.equals(other.nodeLabel);
        }
        return false;
    }

    @Override
    public String toString() {
        if (astNode != null) {
            return "[" + astNode.getEscapedCodeStr() + "]";
        }
        return nodeLabel;
    }
}
