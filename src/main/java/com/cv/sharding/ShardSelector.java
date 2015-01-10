package com.cv.sharding;

import java.net.InetSocketAddress;

public interface ShardSelector {
	public InetSocketAddress getConnectionInfo();
}
