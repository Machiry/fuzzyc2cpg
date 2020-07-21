package io.seclab.spider.adapter

import io.seclab.spider.cfg.{CFGEdge, CFGNode, CFGNodeBuilder, ControlFlowGraph}
import io.shiftleft.fuzzyc2cpg.adapter.CpgAdapter
import io.shiftleft.fuzzyc2cpg.adapter.EdgeKind.EdgeKind
import io.shiftleft.fuzzyc2cpg.adapter.EdgeProperty.EdgeProperty
import io.shiftleft.fuzzyc2cpg.adapter.NodeKind.NodeKind
import io.shiftleft.fuzzyc2cpg.adapter.NodeProperty.NodeProperty
import io.shiftleft.fuzzyc2cpg.ast.AstNode

class CFGAdapter(targetCfg: ControlFlowGraph) extends
  CpgAdapter[CFGNodeBuilder, CFGNode, CFGEdge, CFGEdge] {
  override def createNodeBuilder(kind: NodeKind): CFGNodeBuilder = ???

  override def createNode(nodeBuilder: CFGNodeBuilder): CFGNode = ???

  override def createNode(nodeBuilder: CFGNodeBuilder, origAstNode: AstNode): CFGNode = ???

  override def addNodeProperty(nodeBuilder: CFGNodeBuilder, property: NodeProperty, value: String): Unit = ???

  override def addNodeProperty(nodeBuilder: CFGNodeBuilder, property: NodeProperty, value: Int): Unit = ???

  override def addNodeProperty(nodeBuilder: CFGNodeBuilder, property: NodeProperty, value: Boolean): Unit = ???

  override def addNodeProperty(nodeBuilder: CFGNodeBuilder, property: NodeProperty, value: List[String]): Unit = ???

  override def createEdgeBuilder(dst: CFGNode, src: CFGNode, edgeKind: EdgeKind): CFGEdge = {
    targetCfg.getOrCreateEdge(src, dst)
  }

  override def createEdge(edgeBuilder: CFGEdge): CFGEdge = {
    edgeBuilder
  }

  override def addEdgeProperty(edgeBuilder: CFGEdge, property: EdgeProperty, value: String): Unit = {
    edgeBuilder.setLabel(value)
  }

  override def mapNode(astNode: AstNode): CFGNode = {
    targetCfg.getOrCreateVertex(astNode)
  }
}
