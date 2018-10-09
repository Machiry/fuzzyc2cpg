package io.shiftleft.fuzzyc2cpg.cfg.nodes;

import io.shiftleft.fuzzyc2cpg.JoernNodeKeys;
import java.util.Map;

public class CfgEntryNode extends AbstractCfgNode
{

	@Override
	public String toString()
	{
		return -1 != getNodeId() ? "[(" + getNodeId() + ") ENTRY]" : "[ENTRY]";
	}

	@Override
	public Map<String, Object> getProperties()
	{
		Map<String, Object> properties = super.getProperties();
		properties.put(JoernNodeKeys.CODE, "ENTRY");
		return properties;
	}
}