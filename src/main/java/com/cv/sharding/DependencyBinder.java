package com.cv.sharding;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class DependencyBinder extends AbstractBinder{

	@Override
	protected void configure() {
		
		bind(LogRepository.class).to(LogDAO.class);
		bind(ShardSelectorImpl.class).to(ShardSelector.class);
	}

}
