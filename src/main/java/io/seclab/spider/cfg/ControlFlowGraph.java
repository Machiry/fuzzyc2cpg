package io.seclab.spider.cfg;

import io.shiftleft.fuzzyc2cpg.ast.AstNode;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.traverse.DepthFirstIterator;

import java.util.HashMap;
import java.util.Iterator;


/***
 * Maintains the control-flow-graph of the code being analyzed.
 */
public class ControlFlowGraph {
    Graph<CFGNode, CFGEdge> BaseGT;
    HashMap<AstNode, CFGNode> VertecesMap;

    public ControlFlowGraph() {
        // Initialize base graph
        BaseGT = new DefaultDirectedGraph<>(CFGEdge.class);
        VertecesMap = new HashMap<AstNode, CFGNode>();
    }

    public boolean addVertex(AstNode n) {
        boolean retVal = false;
        if (!VertecesMap.containsKey(n)) {
            CFGNode nodeCont = new CFGNode(n);
            VertecesMap.put(n, nodeCont);
            BaseGT.addVertex(nodeCont);
            retVal = true;
        }
        return retVal;
    }

    public void addVertex(CFGNode n) {
        BaseGT.addVertex(n);
    }

    public CFGNode getVertex(AstNode n) {
        assert (VertecesMap.containsKey(n));
        return VertecesMap.get(n);
    }

    public CFGNode getOrCreateVertex(AstNode n) {
        if (!VertecesMap.containsKey(n)) {
            addVertex(n);
        }
        return getVertex(n);
    }

    public CFGEdge getOrCreateEdge(CFGNode src, CFGNode dst) {
        if (!BaseGT.containsVertex(src)) {
            BaseGT.addVertex(src);
        }
        if (!BaseGT.containsVertex(dst)) {
            BaseGT.addVertex(dst);
        }
        if (!BaseGT.containsEdge(src, dst)) {
            CFGEdge ne = new CFGEdge(src.toString() + " to " + dst.toString());
            BaseGT.addEdge(src, dst, ne);
        }
        return BaseGT.getEdge(src, dst);
    }

    public void dumpGraph() {
        Iterator<CFGNode> iter = new DepthFirstIterator<>(BaseGT);
        while (iter.hasNext()) {
            CFGNode nn = iter.next();
            String vertex = nn.toString();
            System.out
                    .print("Vertex " + vertex + " stats:\n");
            for (CFGEdge outEdge : BaseGT.outgoingEdgesOf(nn)) {
                System.out.print("Connected using: " + outEdge.toString() + " to ");
                System.out.println(BaseGT.getEdgeTarget(outEdge).toString());
            }
            System.out.println();
        }
    }
}
