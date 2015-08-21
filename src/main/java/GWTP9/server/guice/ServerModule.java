package GWTP9.server.guice;

import com.gwtplatform.dispatch.rpc.server.guice.HandlerModule;

import GWTP9.serwer.CzlowiekHandler;
import GWTP9.shared.CzlowiekAction;

public class ServerModule extends HandlerModule {
	@Override
	protected void configureHandlers() {
		bindHandler(CzlowiekAction.class, CzlowiekHandler.class);
	}
}
