package io.seclab.spider.cfg;

import java.util.HashMap;
import java.util.Map;

public class CFGEdge {
    public static final String EMPTY_LABEL = "";
    public static final String TRUE_LABEL = "True";
    public static final String FALSE_LABEL = "False";
    public static final String EXCEPT_LABEL = "except";
    public static final String HANDLED_EXCEPT_LABEL = "catch";
    public static final String UNHANDLED_EXCEPT_LABEL = "";

    private String label;
    private Map<String, Object> properties;
    private String uniqueKey;

    public CFGEdge(String uKey) {
        uniqueKey = uKey;
    }

    public void setLabel(String lbl) {
        this.label = lbl;
    }

    public String getLabel() {
        return this.label;
    }

    public Map<String, Object> getProperties() {
        if (this.properties == null) {
            this.properties = new HashMap<String, Object>();
            this.properties.put("flowLabel", label);
        }
        return this.properties;
    }

    @Override
    public int hashCode() {
        return (uniqueKey == null) ? 0 : uniqueKey.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof CFGEdge)) {
            return false;
        }
        CFGEdge other = (CFGEdge) obj;
        if (uniqueKey == null) {
            if (other.uniqueKey != null) {
                return false;
            }
        } else if (!uniqueKey.equals(other.uniqueKey)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return " ==[" + getLabel() + "(" + uniqueKey + ")" + "]==> ";
    }
}
